package com.company.product.api;

import com.company.product.dto.category.CategoryResponse;
import com.company.product.service.CategoryService;
import com.company.product.util.ApiPaths;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping(ApiPaths.CategoryCtrl.CTRL)
@CrossOrigin
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public Flux<CategoryResponse> getAll(){
        return categoryService.getAll();
    }
}
