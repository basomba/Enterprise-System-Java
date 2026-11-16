package com.universalenterprise.service;

import com.universalenterprise.model.Category;
import com.universalenterprise.repository.CategoryRepository;

public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}