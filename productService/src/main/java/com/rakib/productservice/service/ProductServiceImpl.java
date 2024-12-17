package com.rakib.productservice.service;

import com.rakib.productservice.entity.Product;
import com.rakib.productservice.model.ProductRequest;
import com.rakib.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public long addProduct(ProductRequest productRequest) {
     //   log.info("Adding product {}", productRequest);
        Product product
                = Product.builder()
                .productName(productRequest.getName())
                .quantity(productRequest.getQuantity())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);

     //   log.info("Product Created");
        return product.getProductId();
    }
}
