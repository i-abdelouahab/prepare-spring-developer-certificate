package com.certif.testing.springunittests.controllers;

import com.certif.testing.springunittests.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/product/{name}")
    public Product getProduct(@PathVariable String name) {
        var product = new Product();
        product.setName(name);
        product.setPrice(10);

        return product;
    }
}
