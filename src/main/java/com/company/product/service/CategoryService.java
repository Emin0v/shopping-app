package com.company.product.service;

import com.company.product.dto.category.CategoryResponse;
import com.company.product.dto.category.CategorySaveRequest;
import com.company.product.model.category.Category;
import reactor.core.publisher.Flux;

public interface CategoryService {

    Flux<CategoryResponse> getAll();

    Category getById(String id);

    CategoryResponse save(CategorySaveRequest request);

}
