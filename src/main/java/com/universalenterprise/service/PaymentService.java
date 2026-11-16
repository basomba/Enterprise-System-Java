package com.universalenterprise.service;

import com.universalenterprise.model.Payment;
import com.universalenterprise.repository.PaymentRepository;

public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }
}