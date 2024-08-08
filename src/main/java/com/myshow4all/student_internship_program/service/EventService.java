// EventService.java
package com.myshow4all.student_internship_program.service;

import com.myshow4all.student_internship_program.entity.Event;
import org.springframework.cglib.core.Local;
//import org.springframework.cglib.core.Predicate;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

//public interface EventService {
////    List<Event> getEventsByDate(LocalDate date);
////
////    Event saveEvent(Event event);
////
////    List<Event> getEventsByDateRange(Date startDate, Date endDate);
//}

public interface EventService
{
    CompletableFuture<Void> saveEvent(Event event);
    CompletableFuture<List<Event>> getAllEvents();
    CompletableFuture<List<Event>> getFilteredEvents(Predicate<Event> predicate);
//    CompletableFuture<List<Event>> getEventsByDateRange(Date startDate, Date endDate);

}
