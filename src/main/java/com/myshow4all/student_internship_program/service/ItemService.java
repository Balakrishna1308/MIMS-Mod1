package com.myshow4all.student_internship_program.service;// ItemService.java (Service Interface)
import com.myshow4all.student_internship_program.entity.Item;

import java.util.List;

public interface ItemService {
    List<Item> searchItems(String searchTerm);
}
