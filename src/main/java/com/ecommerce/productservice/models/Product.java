package com.ecommerce.productservice.models;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private Double price;
    private String description;
    private String imageUrl;
    private String category;
}
