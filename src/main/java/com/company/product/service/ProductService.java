package com.company.product.service;

import com.company.product.dto.product.ProductResponse;
import com.company.product.dto.product.ProductSaveRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {

     Flux<ProductResponse> getAll();

     ProductResponse save(ProductSaveRequest request);

     Mono<Long> count();
}
