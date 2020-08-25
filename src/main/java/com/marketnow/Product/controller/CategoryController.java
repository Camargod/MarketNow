package com.marketnow.Product.controller;

import com.marketnow.Product.entity.Category;
import com.marketnow.Product.model.CreateCategoryRequest;
import com.marketnow.Product.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")

public class CategoryController
{
    private CategoryService service;

    public CategoryController(CategoryService service)
    {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id)
    {
        Category category = this.service.getCategoryById(id);
        return ResponseEntity.ok(category);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCategoryById(@PathVariable Long id)
    {
        this.service.removeById(id);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<?> getCategory()
    {
        List<Category> categories = this.service.getAllCategories();
        return ResponseEntity.ok(categories);
    }

    @PostMapping
    public ResponseEntity<?> createCategory(@RequestBody CreateCategoryRequest request)
    {
        return ResponseEntity.ok(this.service.insertCategory(request));
    }
}
