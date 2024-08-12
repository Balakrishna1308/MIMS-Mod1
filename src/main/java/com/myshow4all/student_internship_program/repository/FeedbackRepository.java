package com.myshow4all.student_internship_program.repository;// FeedbackRepository.java

import com.myshow4all.student_internship_program.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CompletableFuture;

//public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
//
//
//}

public interface FeedbackRepository extends JpaRepository<Feedback, Long>{

//    @Query("SELECT f FROM Feedback WHERE f.content LIKE %?1%")
    CompletableFuture<List<Feedback>> findByCommentContaining(String keyword);
}