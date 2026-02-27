package com.task3.task3.dataAccess.abstracts;

import com.task3.task3.entities.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Long> {
}