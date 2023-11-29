package com.myshow4all.student_internship_program.repository;

import com.myshow4all.student_internship_program.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<FileEntity, Long> {
}
