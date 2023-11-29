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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TraineeServiceImpl implements TraineeService {

    @Autowired
    private TraineeRepository traineeRepository;

    @Override
    public List<Trainee> getAllTrainees() {
        return traineeRepository.findAll();
    }

    @Override
    public Optional<Trainee> getTraineeById(Long traineeId) {
        return traineeRepository.findById(traineeId);
    }

    @Override
    public Trainee saveTrainee(Trainee trainee) {
        return traineeRepository.save(trainee);
    }

    @Override
    public void deleteTrainee(Long traineeId) {
        traineeRepository.deleteById(traineeId);
    }

    @Override
    public void deleteSelectedTrainees(List<Long> traineeIds) {
        for (Long traineeId : traineeIds) {
            traineeRepository.deleteById(traineeId);
        }
    }



}
