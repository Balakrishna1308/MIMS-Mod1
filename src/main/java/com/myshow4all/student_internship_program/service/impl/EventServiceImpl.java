package com.myshow4all.student_internship_program.service.impl;// EventServiceImpl.java

import com.myshow4all.student_internship_program.entity.Event;
import com.myshow4all.student_internship_program.repository.EventRepository;
import com.myshow4all.student_internship_program.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cglib.core.Predicate;
import java.util.function.Predicate;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

//@Service
//public class EventServiceImpl implements EventService {
//
//    private final EventRepository eventRepository;
//
//    @Autowired
//    public EventServiceImpl(EventRepository eventRepository) {
//        this.eventRepository = eventRepository;
//    }
//
//    @Override
//    public List<Event> getEventsByDate(LocalDate date) {
//        return eventRepository.findByDate(date);
//    }
//
//    @Override
//    public Event saveEvent(Event event) {
//        return eventRepository.save(event);
//    }
//
//    @Override
//    public List<Event> getEventsByDateRange(Date startDate, Date endDate) {
//        return null;
//    }
//
//}

@Service
public class EventServiceImpl implements EventService
{
    @Autowired
    private EventRepository eventRepository;

    @Async
    @Override
    public CompletableFuture<Void> saveEvent(Event event) {
        eventRepository.save(event);
        return CompletableFuture.completedFuture(null);
        }

    @Async
    @Override
    public CompletableFuture<List<Event>> getAllEvents() {

        return CompletableFuture.completedFuture(eventRepository.findAll());
    }




    @Async
        public CompletableFuture<List<Event>> getFilteredEvents(Predicate<Event> predicate) {

        List<Event> listOfAllEvents = eventRepository.findAll();
        List<Event> filteredEvents = listOfAllEvents.stream().filter(predicate).collect(Collectors.toList());
        return CompletableFuture.completedFuture(filteredEvents);
    }





//    @Async
//    @Override
//    public CompletableFuture<List<Event>> getEventsByDateRange(Date startDate, Date endDate) {
//        List<Event> eventsByDateRange = eventRepository.findEventsByDateRange(startDate, endDate);
//        return CompletableFuture.completedFuture(eventsByDateRange);
//       }
}
