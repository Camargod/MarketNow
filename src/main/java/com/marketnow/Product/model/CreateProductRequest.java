package com.marketnow.Product.model;


import com.marketnow.Product.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CreateProductRequest
{
    public String name;
    public Float price;
    public List<String> images;
    public Category category;
    public String description;
}
