package com.myshow4all.student_internship_program.controller;

import com.myshow4all.student_internship_program.entity.Task;
import com.myshow4all.student_internship_program.entity.Trainee;
import com.myshow4all.student_internship_program.repository.TaskRepository;
import com.myshow4all.student_internship_program.service.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@CrossOrigin(origins = "http://localhost:3000") // Replace with the actual URL of your ReactJS
@Tag
        (
                name = "CRUD REST APIs for Task Resource"
        )
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }




    @GetMapping
    @Operation
            (
                    summary = "Get All Tasks REST API",
                    description = "Get All Tasks REST API is used to fetch the completeness of " +
                                   "all the tasks"
            )
    @ApiResponses
            (
                    value=@ApiResponse
                            (
                                    responseCode = "200",
                                    description = "HTTP Status code 200, OK - Fetched all the tasks"
                            )
            )
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasks = taskService.getAllTasks();
        return ResponseEntity.ok(tasks);
    }






    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        Task task = taskService.getTaskById(id);
        return ResponseEntity.ok(task);
    }





    @Operation
            (
                 summary = "Create Task REST API",
                 description = "Create Task REST API is used to create the new task into the database"
            )
    @ApiResponses
            (
                    value = @ApiResponse
                            (
                               responseCode = "201",
                               description = "HTTP Status 201, created - Task is created"
                            )
            )
    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task savedTask = taskService.saveTask(task);
//        return ResponseEntity.ok(savedTask);
        return new ResponseEntity<>(savedTask, HttpStatus.CREATED);
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
    @Operation
            (
                    summary = "Task Complete RESP API",
                    description = "Task Complete RESP API is used to mark the task to be completed"
            )
    @ApiResponses
            (
                    value =
                    @ApiResponse
                            (
                                 responseCode = "200",
                                 description = "HTTP Status 200, OK - task is marked as complete"
                            )
            )
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
    @Operation
            (
                  summary = "Delete Task REST API",
                  description = "Delete Task REST API is used to delete the task associated" +
                                "with the input ID"
            )
    @ApiResponses
            (
                    value =
                            @ApiResponse
                                    (
                                           responseCode = "204",
                                           description = "HTTP Status 204, OK - Task deleted successfully!"
                                    )
            )
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build();

    }
}
