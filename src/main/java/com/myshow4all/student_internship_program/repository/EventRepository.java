package com.myshow4all.student_internship_program.repository;

// EventRepository.java

import com.myshow4all.student_internship_program.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

//    List<Event> findByDate(LocalDate date);





//    @Query("SELECT e FROM Event e WHERE e.dateTime BETWEEN :startDate AND :endDate")
//    List<Event> findEventsByDateRange(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

}
