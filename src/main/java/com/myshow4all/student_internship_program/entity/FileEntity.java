package com.myshow4all.student_internship_program.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class FileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    @Lob
    private byte[] fileContent;

    // Getters and setters
}
