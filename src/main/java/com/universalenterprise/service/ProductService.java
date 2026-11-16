package com.universalenterprise.service;

import com.universalenterprise.model.Product;
import com.universalenterprise.repository.ProductRepository;

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}