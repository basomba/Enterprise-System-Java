package com.universalenterprise.model;

public class Company {

    private Long id;
    private String name;
    private String taxId;
    private String address;
    private String email;
    private String phone;

    public Company(){

    }

    public Company(Long id, String name, String taxId, String address, String email, String phone){
        this.id=id;
        this.name=name;
        this.taxId=taxId;
        this.address=address;
        this.email=email;
        this.phone=phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
