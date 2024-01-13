package com.myshow4all.student_internship_program.controller;


import com.myshow4all.student_internship_program.dto.LoginRequest;
import com.myshow4all.student_internship_program.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// AuthController.java
@RestController
//@RequestMapping("/api/auth")
@RequestMapping("/api/v1/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {
    @Autowired
    private UserService userService;

//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
//        String username = loginRequest.getUsername();
//        String password = loginRequest.getPassword();
//
//        if (userService.validateUser(username, password)) {
//            return ResponseEntity.ok("Login successful");
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//        }
//    }



    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();

        if (userService.validateUser(username, password)) {
            // Return a JSON object with a token
            Map<String, String> response = new HashMap<>();
            response.put("token", "yourAuthToken");
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Collections.singletonMap("error", "Invalid credentials"));
        }
    }


    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();

        if (userService.validateUser(username, password)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User already exists");
        } else {
            userService.registerUser(username, password);
            return ResponseEntity.ok("Registration successful");
        }
    }
}
