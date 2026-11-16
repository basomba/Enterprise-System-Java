package com.universalenterprise.service;

import com.universalenterprise.repository.StockMovementRepository;

public class InventoryService {

    private final StockMovementRepository stockMovementRepository;

    public InventoryService(StockMovementRepository stockMovementRepository) {
        this.stockMovementRepository = stockMovementRepository;
    }
}