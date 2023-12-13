package com.myshow4all.student_internship_program.entity;

import com.sun.jdi.request.EventRequest;
import lombok.Data;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;

    private String description;

    public Event(Long id, Date date, String description) {
        this.id = id;
        this.date = date;
        this.description = description;
    }

    public Event() {
    }

    public void setDate(Class<? extends EventRequest> aClass) {

    }

    public void setDescription(Class<? extends EventRequest> aClass) {

    }
}
