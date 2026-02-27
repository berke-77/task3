package com.task3.task3.entities.concretes;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // products.category_id -> categories.id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(columnDefinition = "TEXT")
    private String explanation;

    public Product() {}

    public Long getId() {
        return id;
    }
    public Category getCategory() {
        return category;
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
    public void setCategory(Category category) {
        this.category = category;
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