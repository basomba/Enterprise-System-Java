package com.universalenterprise.model;

import java.math.BigDecimal;

public class SaleDetail {

    private Long id;
    private Product product;
    private int quantity;
    private BigDecimal unitPrice;
    private BigDecimal subtotal;

    public SaleDetail(){

    }

    public SaleDetail(Long id, Product product, int quantity, BigDecimal unitPrice, BigDecimal subtotal){
        this.id=id;
        this.product=product;
        this.quantity=quantity;
        this.unitPrice=unitPrice;
        this.subtotal=subtotal;

    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}