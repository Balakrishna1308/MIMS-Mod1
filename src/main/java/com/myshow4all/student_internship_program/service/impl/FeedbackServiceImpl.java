package com.myshow4all.student_internship_program.service.impl;

import com.myshow4all.student_internship_program.entity.Feedback;
import com.myshow4all.student_internship_program.repository.FeedbackRepository;
import com.myshow4all.student_internship_program.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }



//    @Override
//    public void saveFeedback(Feedback feedback) {
//
//    }

        @Override
        public void saveFeedback(Feedback feedback) {
        try {
            System.out.println("Saving feedback: " + feedback.getContent());

            feedbackRepository.save(feedback);

            System.out.println("Feedback saved successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error saving feedback: " + e.getMessage());
        }
    }


    // Implement additional methods as needed, e.g., getByUserId, getByDateRange, etc.
}
