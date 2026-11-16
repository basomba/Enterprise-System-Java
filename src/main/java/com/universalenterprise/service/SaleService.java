package com.universalenterprise.service;

import com.universalenterprise.model.Sale;
import com.universalenterprise.repository.SaleRepository;

public class SaleService {

    private final SaleRepository saleRepository;

    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }
}