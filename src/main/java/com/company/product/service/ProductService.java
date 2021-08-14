package com.company.product.service;

import com.company.product.dto.product.ProductDetailResponse;
import com.company.product.dto.product.ProductResponse;
import com.company.product.dto.product.ProductSaveRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {

     Flux<ProductResponse> getAll();

     Flux<ProductResponse> getAllByCategoryId(String categoryId);

     ProductResponse save(ProductSaveRequest request);

     Mono<Long> count();

     Mono<ProductDetailResponse> getProductDetail(String id);
}
