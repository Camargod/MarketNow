package com.marketnow.Product.repository;


import com.marketnow.Product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> { }
