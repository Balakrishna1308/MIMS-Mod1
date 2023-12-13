package com.myshow4all.student_internship_program.payload;

import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;

@Data
public class EventRequest {
    private DateWrapper date;
    private String description;

    // Constructors, getters, and setters


    public EventRequest(DateWrapper date, String description) {
        this.date = date;
        this.description = description;
    }


    public EventRequest() {
    }
}