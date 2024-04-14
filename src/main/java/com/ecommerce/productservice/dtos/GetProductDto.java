package com.ecommerce.productservice.dtos;

import lombok.Data;

@Data
public class GetProductDto {
    private String name;
    private Double price;
    private String imageUrl;
}
