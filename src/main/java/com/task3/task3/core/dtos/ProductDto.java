package com.task3.task3.core.dtos;

import java.math.BigDecimal;

public class ProductDto {
    private Long id;
    private Long categoryId;
    private String categoryName;
    private String name;
    private BigDecimal price;
    private String explanation;

    public ProductDto() {}

    public ProductDto(Long id, Long categoryId, String categoryName, String name, BigDecimal price, String explanation) {
        this.id = id;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }

    public Long getId() {
        return id;
    }
    public Long getCategoryId() {
        return categoryId;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public String getName() {
        return name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public String getExplanation() {
        return explanation;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}