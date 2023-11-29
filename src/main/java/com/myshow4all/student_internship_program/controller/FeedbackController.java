package com.myshow4all.student_internship_program.controller;// FeedbackController.java

import com.myshow4all.student_internship_program.entity.Feedback;
import com.myshow4all.student_internship_program.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin(origins = "http://localhost:3000") // Replace with the actual URL of your ReactJS app
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @PostMapping
    public ResponseEntity<String> submitFeedback(@RequestBody String feedbackContent) {
        try {
            Feedback feedback = new Feedback();
            feedback.setContent(feedbackContent);
            feedbackRepository.save(feedback);

            return ResponseEntity.ok("Feedback submitted successfully!");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error submitting feedback: " + e.getMessage());
        }
    }
}
