package com.myshow4all.student_internship_program.dto;

import lombok.Data;

// LoginRequest.java
@Data
public class LoginRequest {
    private String username;
    private String password;

    // Constructors, getters, and setters


    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public LoginRequest() {
    }
}
