package com.universalenterprise.repository;

import com.universalenterprise.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    public final List<Customer>customers = new ArrayList<>();

    public void save(Customer customer){
        customers.add(customer);
    }

    public List<Customer>Findall(){
        return new ArrayList<>(customers);
    }

   public Customer findById(Long id){
        return customers.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                .orElse(null);
   }

    public boolean update(Customer updatedCustomer) {

        for (int i = 0; i < customers.size(); i++) {

            if (customers.get(i).getId()
                    .equals(updatedCustomer.getId())) {

                customers.set(i, updatedCustomer);
                return true;
            }
        }

        return false;
    }

    public boolean deleteById(Long id) {
        return customers.removeIf(
                customer -> customer.getId().equals(id)
        );
    }
}
