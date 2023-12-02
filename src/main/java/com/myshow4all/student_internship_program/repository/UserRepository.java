// UserRepository.java
package com.myshow4all.student_internship_program.repository;

import com.myshow4all.student_internship_program.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// UserRepository.java
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    User findByUsernameAndPassword(String username, String password);

    boolean existsByUsername(String username);
}

