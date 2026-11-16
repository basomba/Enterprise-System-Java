
package com.universalenterprise.service;

import com.universalenterprise.model.Customer;
import com.universalenterprise.repository.CustomerRepository;

import java.util.List;

public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }


    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    public boolean update(Customer customer) {
        return customerRepository.update(customer);
    }

    public boolean deleteById(Long id) {
        return customerRepository.deleteById(id);
    }
}
