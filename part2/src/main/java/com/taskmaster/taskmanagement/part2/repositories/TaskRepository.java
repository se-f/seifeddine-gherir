package com.taskmaster.taskmanagement.repositories;

import com.taskmaster.taskmanagement.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
