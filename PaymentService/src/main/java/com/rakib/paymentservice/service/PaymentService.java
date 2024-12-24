package com.rakib.paymentservice.service;

import com.rakib.paymentservice.model.PaymentRequest;
import com.rakib.paymentservice.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
