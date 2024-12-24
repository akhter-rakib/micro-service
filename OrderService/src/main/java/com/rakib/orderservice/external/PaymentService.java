package com.rakib.orderservice.external;

import com.rakib.orderservice.external.request.PaymentRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "PAYMENT-SERVICE/payments")
public interface PaymentService {

    @PostMapping
    ResponseEntity<Long> doPayment(@RequestBody PaymentRequest paymentRequest);

}
