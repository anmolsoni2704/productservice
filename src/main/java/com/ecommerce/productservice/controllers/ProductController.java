package com.ecommerce.productservice.controllers;

import com.ecommerce.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{id}")
    public String getProductById(@PathVariable("id") Long id){
        return "Here's your product " + id;
    }

//    @RequestBody Product product -> converts json into Java object

    @PostMapping("")
    public String createProduct(@RequestBody Product product){
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        return "Product created: " + product.getName();
    }
}