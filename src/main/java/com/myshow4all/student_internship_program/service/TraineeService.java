package com.myshow4all.student_internship_program.service;

// TraineeService.java


import com.myshow4all.student_internship_program.entity.Trainee;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface TraineeService {

//    List<Trainee> getAllTrainees();

//    Optional<Trainee> getTraineeById(Long traineeId);

//    Trainee saveTrainee(Trainee trainee);

//    void deleteTrainee(Long traineeId);

//    void deleteSelectedTrainees(List<Long> traineeIds);

//    Trainee getTraineeDetails();








   CompletableFuture<Void> saveTrainee(Trainee trainee);

   CompletableFuture<List<Trainee>> getAllTrainees();
   CompletableFuture<Trainee> getTraineeById(Long traineeId);
   CompletableFuture<List<Trainee>> getTraineesByDomain(String domain);

   CompletableFuture<Void> deleteSelectedTrainee(Long traineeId);
   CompletableFuture<Void> deleteSelectedTrainees(List<Long> traineeIds);

}






