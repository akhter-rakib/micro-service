package com.rakib.paymentservice.service;

import com.rakib.paymentservice.model.PaymentRequest;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);
}
