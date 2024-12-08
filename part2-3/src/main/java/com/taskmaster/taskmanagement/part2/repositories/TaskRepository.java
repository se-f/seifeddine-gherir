package com.taskmaster.taskmanagement.part2.repositories;

import com.taskmaster.taskmanagement.part2.entities.Category;
import com.taskmaster.taskmanagement.part2.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
//    List<Task> findAllByPriority(String priority);
//
//    List<Task> findAllByCategory(Category category);
}
