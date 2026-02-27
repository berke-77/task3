package com.task3.task3.business.concretes;

import com.task3.task3.business.abstracts.ProductService;
import com.task3.task3.core.dtos.ProductDto;
import com.task3.task3.dataAccess.abstracts.ProductDao;
import com.task3.task3.entities.concretes.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private final ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    private ProductDto toDto(Product p) {
        return new ProductDto(
                p.getId(),
                p.getCategory().getId(),
                p.getCategory().getName(),
                p.getName(),
                p.getPrice(),
                p.getExplanation()
        );
    }

    @Override
    public List<ProductDto> getAll() {
        List<Product> products = productDao.findAll();
        return products.stream().map(this::toDto).toList();
    }

    @Override
    public ProductDto getById(Long id) {
        Product p = productDao.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found: " + id));
        return toDto(p);
    }
}