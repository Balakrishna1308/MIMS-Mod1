package com.myshow4all.student_internship_program.service.impl;

import com.myshow4all.student_internship_program.entity.Task;
import com.myshow4all.student_internship_program.repository.TaskRepository;
import com.myshow4all.student_internship_program.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public Task toggleTaskComplete(Long id) {
        Task task = getTaskById(id);
        if (task != null) {
            task.setCompleted(!task.isCompleted());
            saveTask(task);
        }
        return task;
    }


//    @Override
//    public boolean toggleComplete(Long id) {
//        Optional<Task> optionalTask = taskRepository.findById(id);
//
//        if (optionalTask.isPresent()) {
//            Task task = optionalTask.get();
//            task.setCompleted(!task.isCompleted());
//            taskRepository.save(task);
//            return true;
//        } else {
//            return false; // Task not found with the given ID
//        }
//    }


    @Override
    public boolean toggleComplete(Long id) {
        Optional<Task> optionalTask = taskRepository.findById(id);
        if (optionalTask.isPresent()) {
            Task task = optionalTask.get();
            task.setCompleted(!task.isCompleted());
            taskRepository.save(task);
            return true;
        }
        return false;
    }

}
