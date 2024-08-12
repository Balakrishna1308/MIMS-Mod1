package com.myshow4all.student_internship_program.service.impl;//package com.myshow4all.student_internship_program.service.impl;
//
//import com.myshow4all.student_internship_program.entity.Feedback;
//import com.myshow4all.student_internship_program.repository.FeedbackRepository;
//import com.myshow4all.student_internship_program.service.FeedbackService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class FeedbackServiceImpl implements FeedbackService {
//
//    @Autowired
//    private FeedbackRepository feedbackRepository;
//
//    @Override
//    public List<Feedback> getAllFeedback() {
//        return feedbackRepository.findAll();
//    }
//
//
//
////    @Override
////    public void saveFeedback(Feedback feedback) {
////
////    }
//
//        @Override
//        public void saveFeedback(Feedback feedback) {
//        try {
//            System.out.println("Saving feedback: " + feedback.getContent());
//
//            feedbackRepository.save(feedback);
//
//            System.out.println("Feedback saved successfully!");
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException("Error saving feedback: " + e.getMessage());
//        }
//    }
//
//
//    // Implement additional methods as needed, e.g., getByUserId, getByDateRange, etc.
//}


import com.myshow4all.student_internship_program.entity.Feedback;
import com.myshow4all.student_internship_program.repository.FeedbackRepository;
import com.myshow4all.student_internship_program.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;

//@Service
@Service
//public class FeedbackServiceImpl implements FeedbackService
public class FeedbackServiceImpl implements FeedbackService
{

//    @Autowired
    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public ResponseEntity<Feedback> saveFeedback(Feedback feedback) {

        feedbackRepository.save(feedback);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<List<Feedback>> getAllFeedbacks() {

        List<Feedback> listOfFeedbacks = feedbackRepository.findAll();
        return ResponseEntity.ok(listOfFeedbacks);
    }

    @Override
    public ResponseEntity<List<Feedback>> getFilteredFeedbacks
            (Function<Feedback, Boolean> predicate) {

           List<Feedback> filteredFeedbacks = feedbackRepository.findAll().stream().filter(predicate::apply)
                   .collect(Collectors.toList());

           return ResponseEntity.ok(filteredFeedbacks);
    }

    @Override
    @Async
    public CompletableFuture<List<Feedback>> searchFeedbackByComment(String keyword) {
        CompletableFuture<List<Feedback>> feedbacksContainingKeyword = feedbackRepository.findByCommentContaining(keyword);
        return feedbacksContainingKeyword;
    }

}
