package com.myshow4all.student_internship_program.controller;

import com.myshow4all.student_internship_program.entity.Task;
import com.myshow4all.student_internship_program.repository.TaskRepository;
import com.myshow4all.student_internship_program.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api/tasks")
@RequestMapping("/api/v1/tasks")
@CrossOrigin(origins = "http://localhost:3000") // Replace with the actual URL of your ReactJS app
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasks = taskService.getAllTasks();
        return ResponseEntity.ok(tasks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        Task task = taskService.getTaskById(id);
        return ResponseEntity.ok(task);
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task savedTask = taskService.saveTask(task);
        return ResponseEntity.ok(savedTask);
    }

//    @PostMapping("/toggleComplete/{id}")
//    public ResponseEntity<Task> toggleTaskComplete(@PathVariable Long id) {
//        Task toggledTask = taskService.toggleTaskComplete(id);
//        return ResponseEntity.ok(toggledTask);
//    }



//    @PostMapping("/toggleComplete/{id}")
//    public ResponseEntity<Task> toggleTaskComplete(@PathVariable Long id) {
//        System.out.println("Toggle complete request received for task with id: " + id);
//
//        Task toggledTask = taskService.toggleTaskComplete(id);
//
//        if (toggledTask != null) {
//            System.out.println("Task toggled successfully: " + toggledTask);
//            return ResponseEntity.ok(toggledTask);
//        } else {
//            System.out.println("Task not found with id: " + id);
//            return ResponseEntity.notFound().build();
//        }
//    }



//    @PostMapping("/toggleComplete/{id}")
//    public ResponseEntity<String> toggleComplete(@PathVariable Long id) {
//        try {
//            // Toggle completion status for the task with the given ID
//            boolean toggled = taskService.toggleComplete(id);
//
//            if (toggled) {
//                return ResponseEntity.ok("Task completion status toggled successfully!");
//            } else {
//                return ResponseEntity.status(404).body("Task not found with id: " + id);
//            }
//        } catch (Exception e) {
//            return ResponseEntity.status(500).body("Error toggling task completion: " + e.getMessage());
//        }
//    }




//    @PostMapping("/toggleComplete/{id}")
//    public ResponseEntity<String> toggleTaskComplete(@PathVariable Long id) {
//
//        try {
//            boolean success = taskService.toggleComplete(id);
//            if (success) {
//                return ResponseEntity.ok("Task completion status toggled successfully!");
//            } else {
//                return ResponseEntity.status(404).body("Task not found with id: " + id);
//            }
//        } catch (Exception e) {
//            return ResponseEntity.status(500).body("Error toggling task completion: " + e.getMessage());
//        }
//    }
//



    @PostMapping("/toggleComplete/{taskId}")
    public ResponseEntity<String> toggleTaskComplete(@PathVariable Long taskId) {

        try {
            boolean success = taskService.toggleComplete(taskId);
            if (success) {
                return ResponseEntity.ok("Task completion status toggled successfully!");
            } else {
                return ResponseEntity.status(404).body("Task not found with id: " + taskId);
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error toggling task completion: " + e.getMessage());
        }
    }




    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }
}
