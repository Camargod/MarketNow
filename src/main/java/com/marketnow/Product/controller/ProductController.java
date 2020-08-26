package com.marketnow.Product.controller;


import com.marketnow.Product.entity.Product;
import com.marketnow.Product.model.CreateProductRequest;
import com.marketnow.Product.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController
{

    private ProductService service;

    public ProductController(ProductService service)
    {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id)
    {
        return ResponseEntity.ok(this.service.getProductById(id));
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts(@PathVariable Long id)
    {
        return ResponseEntity.ok(this.service.getProducts());
    }

    @PostMapping
    public ResponseEntity<Product> saveProducts(@RequestBody CreateProductRequest request)
    {
        return ResponseEntity.ok(this.service.insertProduct(request));
    }
}
