package com.universalenterprise.service;

import com.universalenterprise.model.Company;
import com.universalenterprise.repository.CompanyRepository;

public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
}