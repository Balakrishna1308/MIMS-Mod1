//// TraineeServiceImpl.java
//package com.myshow4all.student_internship_program.service.impl;
//
//import com.myshow4all.student_internship_program.entity.Trainee;
//import com.myshow4all.student_internship_program.repository.TraineeRepository;
//import com.myshow4all.student_internship_program.service.TraineeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class TraineeServiceImpl implements TraineeService {
//
//    @Autowired
//    private TraineeRepository traineeRepository;
//
//    @Override
//    public List<Trainee> getAllTrainees() {
//        return traineeRepository.findAll();
//    }
//
//    @Override
//    public Optional<Trainee> getTraineeById(Long traineeId) {
//        return traineeRepository.findById(traineeId);
//    }
//
//    @Override
//    public Trainee saveTrainee(Trainee trainee) {
//        return traineeRepository.save(trainee);
//    }
//
//    @Override
//    public void deleteTrainee(Long traineeId) {
//        traineeRepository.deleteById(traineeId);
//    }
//
//    @Override
//    public void deleteSelectedTrainees(List<Long> traineeIds) {
//        for (Long traineeId : traineeIds) {
//            traineeRepository.deleteById(traineeId);
//        }
//    }
//
//}




// TraineeServiceImpl.java
package com.myshow4all.student_internship_program.service.impl;

import com.myshow4all.student_internship_program.entity.Trainee;
import com.myshow4all.student_internship_program.repository.TraineeRepository;
import com.myshow4all.student_internship_program.service.TraineeService;
import com.myshow4all.student_internship_program.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class TraineeServiceImpl implements TraineeService {

    @Autowired
    private TraineeRepository traineeRepository;

    @Override
    @Async
    public CompletableFuture<Void> saveTrainee(Trainee trainee) {

        traineeRepository.save(trainee);
//        return CompletableFuture.completedFuture(null);
        return CompletableFuture.completedFuture(null);
    }

    @Override
    @Async
    public CompletableFuture<List<Trainee>> getAllTrainees() {

        return CompletableFuture.completedFuture(traineeRepository.findAll());

    }

    @Override
    @Async
    public CompletableFuture<Trainee> getTraineeById(Long traineeId) {

        return null;
    }

    @Override
    @Async
    public CompletableFuture<List<Trainee>> getTraineesByDomain(String domain) {

        //First approach
//        Predicate<Trainee> byDomain = trainee -> domain.equals(trainee.getInternshipDomain());
//        List<Trainee> listOfTrainees = traineeRepository.findAll();
//        List<Trainee>listOfTraineesByDomain = listOfTrainees.stream().filter(byDomain).collect(Collectors.toList());
//        return CompletableFuture.completedFuture(listOfTraineesByDomain);



        //Second approach
//       List<Trainee> listOfTraineesByDomain = traineeRepository.findAll()
//                .stream()
//                .filter(trainee -> domain.equals(trainee.getInternshipDomain()))
//                .collect(Collectors.toList());
//        return CompletableFuture.completedFuture(listOfTraineesByDomain);


        //Third approach
        List<Trainee> listOfTrainees = traineeRepository.findAll();
        return CompletableFuture.completedFuture(Utils.filterList(listOfTrainees, trainee->domain.equals(trainee.getInternshipDomain())));
    }

    @Override
    @Async
    public CompletableFuture<Void> deleteSelectedTrainee(Long traineeId) {
        return null;
    }

    @Override
    @Async
    public CompletableFuture<Void> deleteSelectedTrainees(List<Long> traineeIds) {

    traineeRepository.deleteAllById(traineeIds);

    return CompletableFuture.completedFuture(null);

    }





//    @Override
////    public List<Trainee> getAllTrainees() {
////        return traineeRepository.findAll();
////    }
//
//    @Override
//    public Optional<Trainee> getTraineeById(Long traineeId) {
//        return traineeRepository.findById(traineeId);
//    }
//
//    @Override
//    public Trainee saveTrainee(Trainee trainee) {
//        return traineeRepository.save(trainee);
//    }
//
//    @Override
//    public void deleteTrainee(Long traineeId) {
//        traineeRepository.deleteById(traineeId);
//    }
//
//    @Override
//    public void deleteSelectedTrainees(List<Long> traineeIds) {
//        for (Long traineeId : traineeIds) {
//            traineeRepository.deleteById(traineeId);
//        }
//    }
//
//    @Override
//    public Trainee getTraineeDetails() {
//        // For simplicity, let's assume you want to get details of the first trainee
//        Optional<Trainee> traineeOptional = traineeRepository.findById(1L); // Assuming 1L is the ID of the trainee you want
//
//        return traineeOptional.orElse(null);
//    }
//
//      public Trainee getTraineeDetailsById(Long traineeId) {
//        Optional<Trainee> traineeOptional = traineeRepository.findByTraineeId(String.valueOf(traineeId));
//
//        return traineeOptional.orElse(null);
//    }




}
