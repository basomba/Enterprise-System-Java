
package com.universalenterprise.repository;

import com.universalenterprise.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository {

    private final List<Product> products = new ArrayList<>();

    public void save(Product product) {
        products.add(product);
    }

    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    public Optional<Product> findById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    // Actualizar producto
    public boolean update(Product updatedProduct) {
        return products.stream()
                .filter(product -> product.getId().equals(updatedProduct.getId()))
                .findFirst()
                .map(product -> {
                    product.setName(updatedProduct.getName());
                    product.setDescription(updatedProduct.getDescription());
                    product.setPrice(updatedProduct.getPrice());
                    product.setStock(updatedProduct.getStock());
                    product.setCategory(updatedProduct.getCategory());
                    product.setActive(updatedProduct.isActive());
                    return true;
                })
                .orElse(false);
    }

    public boolean deleteById(Long id) {
        return products.removeIf(product -> product.getId().equals(id));
    }
}

