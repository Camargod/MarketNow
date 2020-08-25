package com.marketnow.Product.service;

import com.marketnow.Product.entity.Category;
import com.marketnow.Product.model.CreateCategoryRequest;
import com.marketnow.Product.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService
{
    private CategoryRepository repository;

    @Autowired
    public CategoryService(CategoryRepository repository)
    {
        this.repository = repository;
    }

    public List<Category> getAllCategories()
    {
        return this.repository.findAll();
    }

    public Category getCategoryById(Long id)
    {
        return this.repository.getOne(id);
    }

    public void removeById(Long id)
    {
        this.repository.deleteById(id);
    }

    public Category insertCategory (CreateCategoryRequest category)
    {
        return this.repository.save(Category.builder().name(category.getName()).description(category.getDescription()).build());
    }

}
