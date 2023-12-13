package com.myshow4all.student_internship_program.repository;

// EventRepository.java

import com.myshow4all.student_internship_program.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findByDate(LocalDate date);

}
