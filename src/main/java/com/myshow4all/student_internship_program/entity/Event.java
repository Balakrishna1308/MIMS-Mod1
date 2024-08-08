package com.myshow4all.student_internship_program.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.jdi.request.EventRequest;
import lombok.Data;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table
        (
             name = "events",
             schema = "student_internship_module_one",
             uniqueConstraints = @UniqueConstraint
                     (
                             name = "unique_event_date_description",
                             columnNames = {"date", "description"}
                     )
        )
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(nullable = false)
    private LocalDate date;


    @Column(nullable = false)
    private String description;




    public Event(Long id, LocalDate date, String description) {
        this.id = id;
        this.date = date;
        this.description = description;
    }



//        public void setDate(Class<? extends EventRequest> aClass) {
//
//        }
//
//        public void setDescription(Class<? extends EventRequest> aClass) {
//
//        }
//    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
