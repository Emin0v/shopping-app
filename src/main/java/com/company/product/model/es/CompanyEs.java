package com.company.product.model.es;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanyEs {
    private String id;
    private String name;
    private String code;
}
