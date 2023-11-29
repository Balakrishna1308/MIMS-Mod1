package com.myshow4all.student_internship_program.service;

import com.myshow4all.student_internship_program.entity.Feedback;

import java.util.List;

public interface FeedbackService {

    List<Feedback> getAllFeedback();

    void saveFeedback(Feedback feedback);

    // Add more methods as needed, e.g., getByUserId, getByDateRange, etc.
}
