package com.universalenterprise.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payment {

    private Long id;
    private Sale sale;
    private BigDecimal amount;
    private LocalDateTime paymentDate;
    private String paymentMethod;
    private String status;

    public Payment(){

    }

    public Payment(Long id, String status, String paymentMethod, LocalDateTime paymentDate, BigDecimal amount, Sale sale) {
        this.id = id;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
        this.amount = amount;
        this.sale = sale;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
