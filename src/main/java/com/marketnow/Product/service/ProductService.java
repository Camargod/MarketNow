package com.marketnow.Product.service;

import com.marketnow.Product.entity.Product;
import com.marketnow.Product.model.CreateProductRequest;
import com.marketnow.Product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService
{
    private ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository)
    {
        this.repository = repository;
    }

    public List<Product> getProducts()
    {
        return this.repository.findAll();
    }

    public Product getProductById(Long id)
    {
        return this.repository.getOne(id);
    }

    public Product insertProduct(CreateProductRequest product)
    {
        return this.repository.save(Product.builder().name(product.getName()).price(product.getPrice()).description(product.getDescription()).images(product.getImages()).build());
    }

}
