package com.task3.task3.api.controllers;

import com.task3.task3.business.abstracts.CategoryService;
import com.task3.task3.entities.concretes.Category;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {

    private final CategoryService categoryService;

    public CategoriesController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/getall")
    public List<Category> getAll() {
        return categoryService.getAll();
    }
}