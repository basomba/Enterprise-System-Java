package com.universalenterprise.service;

import com.universalenterprise.model.Supplier;
import com.universalenterprise.repository.SupplierRepository;

public class SupplierService {

    private final SupplierRepository supplierRepository;

    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }
}