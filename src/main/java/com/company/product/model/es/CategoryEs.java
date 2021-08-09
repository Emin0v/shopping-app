package com.company.product.model.es;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryEs {
    private String id;
    private String name;
    private String code;
}