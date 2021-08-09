package com.company.product.service;

import com.company.product.model.Product;
import com.company.product.model.es.ProductEs;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductEsService {

    Mono<ProductEs> saveNewProduct(Product product);

    Flux<ProductEs> findAll();

    Mono<ProductEs> findById(String id);
}
