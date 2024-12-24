package com.rakib.orderservice.service;

import com.rakib.orderservice.model.OrderRequest;
import com.rakib.orderservice.model.OrderResponse;

public interface OrderService {

    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}


