package com.myshow4all.student_internship_program.repository;// FeedbackRepository.java

import com.myshow4all.student_internship_program.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {


}
