package com.myshow4all.student_internship_program.service;

import com.myshow4all.student_internship_program.entity.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task saveTask(Task task);
    void deleteTask(Long id);
    Task toggleTaskComplete(Long id);

    boolean toggleComplete(Long id);
}
