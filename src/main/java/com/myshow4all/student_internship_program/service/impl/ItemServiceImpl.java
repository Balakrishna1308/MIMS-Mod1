package com.myshow4all.student_internship_program.service.impl;// ItemServiceImpl.java (Service Implementation)
import com.myshow4all.student_internship_program.entity.Item;
import com.myshow4all.student_internship_program.repository.ItemRepository;
import com.myshow4all.student_internship_program.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> searchItems(String searchTerm) {
        // Implement your search logic here using the itemRepository
        // You might use the JpaRepository's query methods or custom queries

        // For example, a simple query method:
        return itemRepository.findByTitleContainingIgnoreCase(searchTerm);
    }
}
