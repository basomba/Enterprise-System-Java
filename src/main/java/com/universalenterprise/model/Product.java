package com.universalenterprise.model;

import java.math.BigDecimal;

public class Product {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int stock;
    private Category category;
    private boolean active;

    public Product(){

    }

    public Product(Long id,String name, String description, BigDecimal price, int stock, Category category, boolean active){

        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.stock=stock;
        this.category=category;
        this.active=active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}


