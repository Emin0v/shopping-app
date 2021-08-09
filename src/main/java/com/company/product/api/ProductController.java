package com.company.product.api;

import com.company.product.dto.product.ProductResponse;
import com.company.product.service.ProductService;
import com.company.product.util.ApiPaths;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping(ApiPaths.ProductCtrl.CTRL)
@CrossOrigin
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public Flux<ProductResponse> getAllProducts() {
        return productService.getAll();
    }


//    @GetMapping("/{id}")
//    public Mono<ProductDetailResponse> getProductDetail(@PathVariable("id") String id) {
//        return productService.getProductDetail(id);
//    }

}
