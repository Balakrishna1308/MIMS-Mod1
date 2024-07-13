package com.myshow4all.student_internship_program.controller;


import com.myshow4all.student_internship_program.dto.LoginRequest;
import com.myshow4all.student_internship_program.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag
( name = "CRUD REST APIs for User resource"
)
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
    @Operation
            (
                 summary = "Login User REST API",
                 description = "It validates the user and allows the user to login if the user already exists"

            )
    @ApiResponses
            (
                 @ApiResponse
                         (
                                 responseCode = "200",
                                 description = "HTTP Response code 200, OK - user successfully logged in"

                         )
            )
    public ResponseEntity<Map<String, String>> loginUser(@RequestBody LoginRequest loginRequest) {
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
    @Operation
            (
                    summary = "Register User RESP API",
                    description = "Register User RESP API is used to register the new user",
                    responses = @ApiResponse
                            (
                                    responseCode = "201",
                                    description = "HTTP Status code 201, created - new user " +
                                                   "created successfully!"
                            )
            )
    public ResponseEntity<String> registerUser(@RequestBody LoginRequest loginRequest) {
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
