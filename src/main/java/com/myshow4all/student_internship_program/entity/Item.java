package com.myshow4all.student_internship_program.entity;

// Item.java (Entity Class)
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String itemName;

    public Item() {
        // Default constructor required by JPA
    }

    public Item(String itemName) {
        this.itemName = itemName;
    }
    // Add other properties as needed

    // Constructors, getters, setters, etc.

    // You can include additional JPA annotations based on your requirements
}
