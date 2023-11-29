package com.myshow4all.student_internship_program.repository;

import com.myshow4all.student_internship_program.entity.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TraineeRepository extends JpaRepository<Trainee, Long>
{

}







