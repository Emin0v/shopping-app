package com.company.product.service.impl;

import com.company.product.dto.category.CategoryResponse;
import com.company.product.dto.category.CategorySaveRequest;
import com.company.product.model.category.Category;
import com.company.product.repository.mongo.CategoryRepository;
import com.company.product.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Flux<CategoryResponse> getAll() {
        return categoryRepository.findAll().map(this::mapToDto);
    }

    @Override
    public Category getById(String id) {
        return categoryRepository.findById(id).block();
    }

    @Override
    public CategoryResponse save(CategorySaveRequest request) {
        Category cat = Category.builder().code("C" + request.getName().charAt(0)).name(request.getName()).build();
        return mapToDto(categoryRepository.save(cat).block());
    }

    private CategoryResponse mapToDto(Category category) {
        if (category == null) {
            return null;
        }
        return CategoryResponse.builder().id(category.getId()).name(category.getName()).build();
    }
}
