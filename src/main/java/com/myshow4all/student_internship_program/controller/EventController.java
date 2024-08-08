package com.myshow4all.student_internship_program.controller;
import com.myshow4all.student_internship_program.entity.Event;
import com.myshow4all.student_internship_program.service.EventService;
import com.sun.jdi.request.EventRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

//@RestController
//@RequestMapping("/api/events")
//@CrossOrigin(origins = "http://localhost:3000")
//public class EventController {
//
//    private final EventService eventService;
//
//    @Autowired
//    public EventController(EventService eventService) {
//        this.eventService = eventService;
//    }
//
//    @GetMapping("/month")
//    public ResponseEntity<List<Event>> getEventsByMonth(@RequestParam String month) {
//        try {
//            // Parse the input month string into a Date object
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
//            Date parsedMonth = dateFormat.parse(month);
//
//            // Calculate the start and end dates of the month
//            Calendar calendar = Calendar.getInstance();
//            calendar.setTime(parsedMonth);
//            calendar.set(Calendar.DAY_OF_MONTH, 1);
//            Date startDate = calendar.getTime();
//
//            calendar.add(Calendar.MONTH, 1);
//            calendar.add(Calendar.DAY_OF_MONTH, -1);
//            Date endDate = calendar.getTime();
//
//            // Fetch events for the specified month
//            List<Event> events = eventService.getEventsByDateRange(startDate, endDate);
//
//            return ResponseEntity.ok(events);
//        } catch (ParseException e) {
//            // Handle the case where the input month is not in the expected format
//            return ResponseEntity.badRequest().body(null);
//        } catch (Exception e) {
//            // Handle other exceptions
//            return ResponseEntity.status(500).body(null);
//        }
//    }
//
//
//    @PostMapping("/click")
//    public ResponseEntity<String> handleDateClick(@RequestBody EventRequest request) {
//        try {
//            Event event = new Event();
//
//
//            event.setDate(request.getClass());
//            event.setDescription(request.getClass());
//
//            eventService.saveEvent(event);
//
//            return ResponseEntity.ok("Event saved successfully");
//        } catch (Exception e) {
//            return ResponseEntity.status(500).body("Error handling date click event");
//        }
//    }
//
//}


@RestController
@RequestMapping("/api/events")
public class EventController
{
    @Autowired
    private EventService eventService;


    @PostMapping("/save")
    public CompletableFuture<ResponseEntity<String>> saveEntity(@RequestBody Event event)
    {
        CompletableFuture<Void> saveEvent = eventService.saveEvent(event);
        return saveEvent.thenApply(aVoid->ResponseEntity.ok("Event saved successfully"))
                .exceptionally(ex->
                        ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                .body("Error saving event: "+ex.getMessage()));
    }



    @GetMapping("/all")
    public CompletableFuture<ResponseEntity<List<Event>>> getAllEvents()
    {
        return eventService.getAllEvents().thenApply(ResponseEntity::ok)
                .exceptionally(ex->ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null));
    }


    @GetMapping("/filter")
    public CompletableFuture<ResponseEntity<List<Event>>> getFilteredEvents(@RequestParam String keyword)

    {
        Predicate<Event> predicate = event -> event.getDescription().contains(keyword);
        return eventService.getFilteredEvents(predicate)
                .thenApply(events ->
                        {
                            if(events.isEmpty())
                            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

                            else
                            return ResponseEntity.ok(events);
                        }
                        );
    }


//    @GetMapping("/date-range")
//    public CompletableFuture<ResponseEntity<List<Event>>> getEventsByDateRange(@RequestParam Date startDate,
//                                     @RequestParam Date endDate)
//    {
//        CompletableFuture<ResponseEntity<List<Event>>> listOfEventsByDateRange = eventService.getEventsByDateRange(startDate, endDate)
//                .thenApply(events ->
//                {
//                    if (events.isEmpty())
//                        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//                    else
//                        return ResponseEntity.ok(events);
//                });
//        return listOfEventsByDateRange;
//    }
}