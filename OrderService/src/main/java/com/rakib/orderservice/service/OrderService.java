package com.rakib.orderservice.service;

import com.rakib.orderservice.model.OrderRequest;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);
}


