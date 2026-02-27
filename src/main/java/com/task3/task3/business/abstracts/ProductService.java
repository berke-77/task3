package com.task3.task3.business.abstracts;

import com.task3.task3.core.dtos.ProductDto;
import java.util.List;

public interface ProductService {
    List<ProductDto> getAll();
    ProductDto getById(Long id);
}