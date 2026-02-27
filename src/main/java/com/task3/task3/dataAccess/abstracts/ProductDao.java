package com.task3.task3.dataAccess.abstracts;

import com.task3.task3.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Long> {
}