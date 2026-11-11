package com.universalenterprise.repository;

import com.sun.management.OperatingSystemMXBean;
import com.universalenterprise.model.Payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class  PaymentRepository{

    List<Payment>payments = new ArrayList<>();

    public void save (Payment payment){
        payments.add(payment);
    }

   public List<Payment>findALL(){
        return new ArrayList<>(payments);
   }

   public Optional<Payment> findID(long id){
        return payments.stream()
                .filter(payment -> payment.getId().equals(id))
                .findFirst();
   }

    public boolean deleteById(Long id) {
        return payments.removeIf(payment ->
                payment.getId().equals(id));
    }

        }
