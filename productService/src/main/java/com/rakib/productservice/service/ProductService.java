package com.rakib.productservice.service;

import com.rakib.productservice.model.ProductRequest;
import com.rakib.productservice.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long id);
}
