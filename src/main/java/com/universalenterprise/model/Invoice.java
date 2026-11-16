package com.universalenterprise.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Invoice {


    private Long id;
    private String invoiceNumber;
    private LocalDateTime issueDate;
    private BigDecimal total;
    private String status;
    private Customer customer;
    private Company company;



    private LocalDateTime date;
    private List<InvoiceDetail> details;

    public Invoice(Long id, List<InvoiceDetail> details, Company company, Customer customer, String status, BigDecimal total, LocalDateTime issueDate, String invoiceNumber) {
        this.id = id;
        this.details = details;
        this.company = company;
        this.customer = customer;
        this.status = status;
        this.total = total;
        this.issueDate = issueDate;
        this.invoiceNumber = invoiceNumber;
    }

    public void Invoice(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<InvoiceDetail> getDetails() {
        return details;
    }

    public void setDetails(List<InvoiceDetail> details) {
        this.details = details;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
