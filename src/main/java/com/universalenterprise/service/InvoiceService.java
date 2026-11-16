package com.universalenterprise.service;

import com.universalenterprise.model.Invoice;
import com.universalenterprise.repository.InvoiceRepository;

public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }
}