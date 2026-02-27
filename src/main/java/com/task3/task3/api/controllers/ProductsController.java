package com.task3.task3.api.controllers;

import com.task3.task3.business.abstracts.ProductService;
import com.task3.task3.core.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public List<ProductDto> getAll() {
        return productService.getAll();
    }

    @GetMapping("/getbyid")
    public ProductDto getById(@RequestParam Long id) {
        return productService.getById(id);
    }
}