package com.myshow4all.student_internship_program.service;

import com.myshow4all.student_internship_program.entity.InternshipDetails;

public interface InternshipDetailsService {
    InternshipDetails saveInternshipDetails(InternshipDetails internshipDetails);
    InternshipDetails findByTraineeID(String traineeID);

}
