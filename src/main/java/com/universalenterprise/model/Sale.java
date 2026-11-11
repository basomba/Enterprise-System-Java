package com.universalenterprise.model;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Sale {

    private Long id;
    private Customer customer;
    private List<SaleDetail> details;
    private LocalDateTime saleDate;
    private BigDecimal total;
    private String status;

    public Sale(){

    }

    public Sale(Long id, Customer customer, List<SaleDetail> details,
                LocalDateTime saleDate, BigDecimal total, String status) {
        this.id = id;
        this.customer = customer;
        this.details = details;
        this.saleDate = saleDate;
        this.total = total;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<SaleDetail> getDetails() {
        return details;
    }

    public void setDetails(List<SaleDetail> details) {
        this.details = details;
    }

    public LocalDateTime getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDateTime saleDate) {
        this.saleDate = saleDate;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
