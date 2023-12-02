package com.myshow4all.student_internship_program.controller;

import com.myshow4all.student_internship_program.dto.RegistrationRequest;
import com.myshow4all.student_internship_program.entity.User;
import com.myshow4all.student_internship_program.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// RegistrationController.java
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody RegistrationRequest registrationRequest) {
        User registeredUser = userService.registerUser(registrationRequest);

        if (registeredUser != null) {
            return ResponseEntity.ok(registeredUser);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}
