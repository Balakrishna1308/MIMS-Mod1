package com.myshow4all.student_internship_program.repository;

import com.myshow4all.student_internship_program.entity.InternshipDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternshipDetailsRepository extends JpaRepository <InternshipDetails, Long>
{
}
