// UserServiceImpl.java
package com.myshow4all.student_internship_program.service.impl;

import com.myshow4all.student_internship_program.dto.RegistrationRequest;
import com.myshow4all.student_internship_program.entity.User;
import com.myshow4all.student_internship_program.repository.UserRepository;
import com.myshow4all.student_internship_program.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//import static com.sun.jndi.ldap.LdapClient.encodePassword;


// UserServiceImpl.java
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(String username, String password) {
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password); // You might want to hash the password in a real-world scenario
        return userRepository.save(newUser);
    }

    @Override
    public boolean validateUser(String username, String password) {
        Optional<User> optionalUser = userRepository.findByUsername(username);
        return optionalUser.isPresent() && optionalUser.get().getPassword().equals(password);
    }







    @Override
    public User loginUser(String username, String password) {
        // Implement your logic for validating login credentials
        // For example, you can query the database to find a user with the given username and password
        return userRepository.findByUsernameAndPassword(username, password);
    }







    @Override
    public User registerUser(RegistrationRequest registrationRequest) {
        // Implement registration logic
        // Check if the username is unique
        if (userRepository.existsByUsername(registrationRequest.getUsername())) {
            return null; // Registration failed, username already exists
        }

        // Create a new user
        User newUser = new User();
        newUser.setUsername(registrationRequest.getUsername());
//        newUser.setPassword(encodePassword(registrationRequest.getPassword())); // Ensure to hash the password
        newUser.setPassword(registrationRequest.getPassword()); // Ensure to hash the password
        // Save the user to the database
        return userRepository.save(newUser);
    }



//    // UserServiceImpl.java
//    @Override
//    public User loginUser(String username, String password) {
//        Optional<User> optionalUser = userRepository.findByUsername(username);
//
//        if (optionalUser.isPresent()) {
//            User user = optionalUser.get();
//            if (passwordEncoder.matches(password, user.getPassword())) {
//                return user;
//            }
//        }
//
//        return null; // Login failed
//    }



}
