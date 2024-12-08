package com.taskmaster.taskmanagement.part3.controllers;


import com.taskmaster.taskmanagement.part2.entities.Category;
import com.taskmaster.taskmanagement.part2.entities.Task;
import com.taskmaster.taskmanagement.part2.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    public TaskService taskService;

    @GetMapping()
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping()
    public Task createTask(@RequestBody Task task) {

        //TODO: error handling
        List<Category> categories = task.getCategories();
        for (Category category : categories) {
            System.out.println(category.getName());
        }

        return taskService.addTask(task);
    }

    @PutMapping()
    public Task updateTask(@RequestBody Task task) {
        return taskService.updateTask(task);
    }

    @DeleteMapping("/{id}")
    public String removeTaskById(@PathVariable int id) {
        return taskService.removeTaskById(id);
    }
}
