package com.myshow4all.student_internship_program.service;

import com.myshow4all.student_internship_program.entity.Feedback;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;

//public interface FeedbackService {
//
//    List<Feedback> getAllFeedback();
//
//    void saveFeedback(Feedback feedback);
//
//    // Add more methods as needed, e.g., getByUserId, getByDateRange, etc.
//
//
////    CompletableFuture<List<Feedback>> getFilteredFeedbacks(Predicate<Feedback> predicate);
//
//}

public interface FeedbackService{
    ResponseEntity<Feedback>  saveFeedback(Feedback feedback);
    ResponseEntity<List<Feedback>> getAllFeedbacks();
    ResponseEntity<List<Feedback>> getFilteredFeedbacks(Function<Feedback, Boolean> predicate);

    //Function functional interface methods
    Function<Feedback, String> feedbackComment = Feedback::getContent;
    Function<String, Integer> commentLength = String::length;
    Function<Feedback, Integer> feedbackCommentLength = feedbackComment.andThen(commentLength);

    CompletableFuture<List<Feedback>> searchFeedbackByComment(String keyword);
}