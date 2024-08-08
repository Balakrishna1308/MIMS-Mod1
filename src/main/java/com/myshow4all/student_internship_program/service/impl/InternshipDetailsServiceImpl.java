package com.myshow4all.student_internship_program.service.impl;

import com.myshow4all.student_internship_program.entity.InternshipDetails;
import com.myshow4all.student_internship_program.repository.InternshipDetailsRepository;
import com.myshow4all.student_internship_program.repository.TraineeRepository;
import com.myshow4all.student_internship_program.service.InternshipDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InternshipDetailsServiceImpl implements InternshipDetailsService {
    @Autowired
    private InternshipDetailsRepository internshipDetailsRepository;

    @Override
    public InternshipDetails saveInternshipDetails(InternshipDetails internshipDetails) {
        return internshipDetailsRepository.save(internshipDetails);
    }

    @Override
    public InternshipDetails findByTraineeID(String traineeID) {
        return internshipDetailsRepository.findByTraineeID(traineeID);
    }
}
