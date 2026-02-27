package com.task3.task3.business.concretes;

import com.task3.task3.business.abstracts.CategoryService;
import com.task3.task3.dataAccess.abstracts.CategoryDao;
import com.task3.task3.entities.concretes.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManager implements CategoryService {

    private final CategoryDao categoryDao;

    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public List<Category> getAll() {
        return categoryDao.findAll();
    }
}