// User.java
package com.myshow4all.student_internship_program.entity;

import jakarta.persistence.*;
import lombok.Data;



// User.java
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    // Constructors, getters, and setters
}
