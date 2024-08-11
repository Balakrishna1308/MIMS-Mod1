package com.myshow4all.student_internship_program.controller;

import com.myshow4all.student_internship_program.entity.Item;
import com.myshow4all.student_internship_program.model.SearchRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// SearchController.java
//@RestController
//@RequestMapping("/api")
//public class SearchController {
//
//    // Mock database data
//    private List<Item> items = Arrays.asList(
//            new Item(1, "Item 1"),
//            new Item(2, "Item 2"),
//            new Item(3, "Item 3")
//            // Add more items as needed
//    );
//
//    @PostMapping("/search")
//    public ResponseEntity<List<Item>> searchItems(@RequestBody SearchRequest searchRequest) {
//        String searchTerm = searchRequest.getSearchTerm().toLowerCase();
//
//        // Server-side search logic (in this case, simple filtering)
//        List<Item> searchResults = items.stream()
//                .filter(item -> item.getTitle().toLowerCase().contains(searchTerm))
//                .collect(Collectors.toList());
//
//        return ResponseEntity.ok(searchResults);
//    }
//}









import com.myshow4all.student_internship_program.entity.Item;
import com.myshow4all.student_internship_program.model.SearchRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// SearchController.java
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class SearchController {

    // Mock database data
    private List<Item> items = Arrays.asList(
            new Item("Item 1"),
            new Item("Item 2"),
            new Item("Item 3")
            // Add more items as needed
    );

    @PostMapping("/search")
    public ResponseEntity<List<Item>> searchItems(@RequestBody SearchRequest searchRequest) {
        String searchTerm = searchRequest.getSearchTerm().toLowerCase();

        // Server-side search logic (in this case, simple filtering)
        List<Item> searchResults = items.stream()
                .filter(item -> item.getItemName().toLowerCase().contains(searchTerm))
                .collect(Collectors.toList());

        return ResponseEntity.ok(searchResults);
    }
}


