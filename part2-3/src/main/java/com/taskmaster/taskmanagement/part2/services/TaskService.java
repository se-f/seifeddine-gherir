package com.taskmaster.taskmanagement.part2.services;

import com.taskmaster.taskmanagement.part2.entities.Category;
import com.taskmaster.taskmanagement.part2.entities.Task;
import com.taskmaster.taskmanagement.part2.repositories.CategoryRepository;
import com.taskmaster.taskmanagement.part2.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task addTask(Task task) {
        taskRepository.save(task);
        return task;
    }

    public Task updateTask(Task task) {
        taskRepository.save(task);
        return task;
    }

    public String removeTaskById(int id) {
        taskRepository.deleteById(id);
        return "Deleted task successfully";
    }

//    public List<Task> filterTaskByPriority(String priority) {
//        return taskRepository.findAllByPriority(priority);
//    }
//
//    public List<Task> filterTaskByCategory(String category) {
//        Category categoryObject = categoryRepository.findByName(category);
//        return taskRepository.findAllByCategory(categoryObject);
//    }
    // TODO: dont forget to sort , filter by priority and category
}
