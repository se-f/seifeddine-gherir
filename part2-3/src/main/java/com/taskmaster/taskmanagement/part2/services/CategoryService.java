package com.taskmaster.taskmanagement.part2.services;


import com.taskmaster.taskmanagement.part2.entities.Category;
import com.taskmaster.taskmanagement.part2.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category addCategory(@RequestBody Category category) {
        categoryRepository.save(category);
        return category;
    }

    public String removeCategory(Category category) {
        categoryRepository.delete(category);
        return "Removed category successfully";
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
