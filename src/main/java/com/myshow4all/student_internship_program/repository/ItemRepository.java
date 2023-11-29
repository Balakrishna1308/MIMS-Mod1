package com.myshow4all.student_internship_program.repository;

import com.myshow4all.student_internship_program.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByTitleContainingIgnoreCase(String searchTerm);
    // You can add custom query methods here if needed
}
