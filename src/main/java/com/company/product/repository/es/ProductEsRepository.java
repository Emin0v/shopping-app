package com.company.product.repository.es;

import com.company.product.model.es.ProductEs;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;
import reactor.core.publisher.Flux;

public interface ProductEsRepository extends ReactiveElasticsearchRepository<ProductEs, String> {

    Flux<ProductEs> findAllByCategory_Id(String id);

}
