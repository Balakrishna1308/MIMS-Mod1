package com.myshow4all.student_internship_program.service;

import com.myshow4all.student_internship_program.entity.Feedback;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public interface FeedbackService {

    List<Feedback> getAllFeedback();

    void saveFeedback(Feedback feedback);

    // Add more methods as needed, e.g., getByUserId, getByDateRange, etc.


//    CompletableFuture<List<Feedback>> getFilteredFeedbacks(Predicate<Feedback> predicate);

}
