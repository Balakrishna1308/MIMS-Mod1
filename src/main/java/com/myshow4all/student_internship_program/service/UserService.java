// UserService.java
package com.myshow4all.student_internship_program.service;

import com.myshow4all.student_internship_program.dto.RegistrationRequest;
import com.myshow4all.student_internship_program.entity.User;

// UserService.java
public interface UserService {
    User registerUser(String username, String password);
    boolean validateUser(String username, String password);

    User loginUser(String username, String password);


    User registerUser(RegistrationRequest registrationRequest);
}
