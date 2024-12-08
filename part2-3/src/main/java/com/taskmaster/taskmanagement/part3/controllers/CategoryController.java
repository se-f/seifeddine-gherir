package com.taskmaster.taskmanagement.part3.controllers;

import com.taskmaster.taskmanagement.part2.entities.Category;
import com.taskmaster.taskmanagement.part2.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    public CategoryService categoryService;

    @GetMapping()
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping()
    public Category addCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }

    @DeleteMapping()
    public String removeCategoryByName(@RequestBody Category category) {
        return categoryService.removeCategory(category);
    }
}
