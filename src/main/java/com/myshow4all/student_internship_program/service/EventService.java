// EventService.java
package com.myshow4all.student_internship_program.service;

import com.myshow4all.student_internship_program.entity.Event;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface EventService {
    List<Event> getEventsByDate(LocalDate date);

    Event saveEvent(Event event);

    List<Event> getEventsByDateRange(Date startDate, Date endDate);
}
