package com.myshow4all.student_internship_program.dto;

import lombok.Data;

// RegistrationRequest.java
@Data
public class RegistrationRequest {
    private String username;
    private String password;

    // Constructors, getters, and setters

    public RegistrationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public RegistrationRequest() {
    }
}
