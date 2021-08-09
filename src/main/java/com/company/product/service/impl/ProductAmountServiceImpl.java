package com.company.product.service.impl;

import com.company.product.service.ProductAmountService;
import org.springframework.stereotype.Service;

@Service
public class ProductAmountServiceImpl implements ProductAmountService {

    @Override
    public int getByProductId(String productId) {
        return 10;
    }
}
