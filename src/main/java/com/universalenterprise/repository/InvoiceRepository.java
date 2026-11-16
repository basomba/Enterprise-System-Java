package com.universalenterprise.repository;

import com.universalenterprise.model.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository {

    private final List<Invoice> invoices = new ArrayList<>();

    public void save(Invoice invoice){
        invoices.add(invoice);
    }

    public List<Invoice>findALL(){
        return new ArrayList<>();
    }

    public Invoice findById(Long id) {
        return invoices.stream()
                .filter(invoice -> invoice.getId().equals(id))
                .findFirst()
                .orElse(null);
    }



public boolean update(Invoice updatedInvoice) {
    return invoices.stream()
            .filter(invoice -> invoice.getId().equals(updatedInvoice.getId()))
            .findFirst()
            .map(invoice -> {
                invoice.setCustomer(updatedInvoice.getCustomer());
                invoice.setDate(updatedInvoice.getDate());
                invoice.setTotal(updatedInvoice.getTotal());
                return true;
            })
            .orElse(false);
}

public boolean deleteById(Long id) {
    return invoices.removeIf(invoice -> invoice.getId().equals(id));
}

}

