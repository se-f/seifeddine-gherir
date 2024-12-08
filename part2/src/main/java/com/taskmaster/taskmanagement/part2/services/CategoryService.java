package com.taskmaster.taskmanagement.services;


import com.taskmaster.taskmanagement.entities.Category;
import com.taskmaster.taskmanagement.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public String addCategory(String name) {
        Category category = new Category(name);
        categoryRepository.save(category);
        return "Added category " + name + " successfully";
    }

    public String removeCategoryByName(String name) {
        Category category = categoryRepository.findByName(name);
        categoryRepository.delete(category);
        return "Removed category " + name + " successfully";
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
