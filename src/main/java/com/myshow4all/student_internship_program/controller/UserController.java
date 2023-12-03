//// UserController.java
//package com.myshow4all.student_internship_program.controller;
//
//import com.myshow4all.student_internship_program.entity.User;
//import com.myshow4all.student_internship_program.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:3000")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/login")
//    public ResponseEntity<User> loginUser(@RequestBody User loginUser) {
//        User user = userService.loginUser(loginUser.getUsername(), loginUser.getPassword());
//
//        if (user != null) {
//            return ResponseEntity.ok(user);
//        } else {
//            return ResponseEntity.badRequest().build();
//        }
//    }
//}
