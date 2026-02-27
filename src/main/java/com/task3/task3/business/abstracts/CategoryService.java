package com.task3.task3.business.abstracts;

import com.task3.task3.entities.concretes.Category;
import java.util.List;

public interface CategoryService {
    List<Category> getAll();
}