package com.company.product.api;

import com.company.product.dto.category.CategoryResponse;
import com.company.product.dto.product.ProductResponse;
import com.company.product.service.CategoryService;
import com.company.product.service.ProductService;
import com.company.product.util.ApiPaths;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping(ApiPaths.CategoryCtrl.CTRL)
@CrossOrigin
public class CategoryController {

    private final CategoryService categoryService;
    private final ProductService productService;

    @GetMapping
    public Flux<CategoryResponse> getAll(){
        return categoryService.getAll();
    }

    @GetMapping("/{categoryId}")
    public Flux<ProductResponse> getAllByCategoryId(@PathVariable("categoryId") String categoryId) {
        return productService.getAllByCategoryId(categoryId);
    }
}
