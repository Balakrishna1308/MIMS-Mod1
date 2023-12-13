package com.myshow4all.student_internship_program.service.impl;// EventServiceImpl.java

import com.myshow4all.student_internship_program.entity.Event;
import com.myshow4all.student_internship_program.repository.EventRepository;
import com.myshow4all.student_internship_program.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> getEventsByDate(LocalDate date) {
        return eventRepository.findByDate(date);
    }

    @Override
    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public List<Event> getEventsByDateRange(Date startDate, Date endDate) {
        return null;
    }

}
