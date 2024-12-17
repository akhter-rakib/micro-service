package com.rakib.productservice.service;

import com.rakib.productservice.model.ProductRequest;

public interface ProductService {
    long addProduct(ProductRequest productRequest);
}
