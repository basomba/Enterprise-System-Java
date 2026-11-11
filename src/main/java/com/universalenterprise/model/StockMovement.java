package com.universalenterprise.model;

import java.time.LocalDateTime;

public class StockMovement {

    private Long id;
    private Product product;
    private int quantity;
    private String movementType;
    private LocalDateTime movementDate;
    private String description;

    public StockMovement(){

    }

    public StockMovement(Long id, String description, LocalDateTime movementDate, String movementType, int quantity, Product product) {
        this.id = id;
        this.description = description;
        this.movementDate = movementDate;
        this.movementType = movementType;
        this.quantity = quantity;
        this.product = product;
    }


    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getMovementDate() {
        return movementDate;
    }

    public String getMovementType() {
        return movementType;
    }

    public Product getProduct() {
        return product;
    }

    public Long getId() {
        return id;
    }
}