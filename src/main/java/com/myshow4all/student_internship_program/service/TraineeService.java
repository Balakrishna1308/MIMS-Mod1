package com.myshow4all.student_internship_program.service;

// TraineeService.java


import com.myshow4all.student_internship_program.entity.Trainee;

import java.util.List;
import java.util.Optional;

public interface TraineeService {

    List<Trainee> getAllTrainees();

    Optional<Trainee> getTraineeById(Long traineeId);

    Trainee saveTrainee(Trainee trainee);

    void deleteTrainee(Long traineeId);

    void deleteSelectedTrainees(List<Long> traineeIds);

    Trainee getTraineeDetails();
}






