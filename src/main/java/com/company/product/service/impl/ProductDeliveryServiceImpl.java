package com.company.product.service.impl;

import com.company.product.model.MoneyTypes;
import com.company.product.service.ProductDeliveryService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductDeliveryServiceImpl implements ProductDeliveryService {


    @Override
    public String getDeliveryInfo(String productId) {
        // TODO
        return "Tomorrow";
    }

    public boolean freeDeliveryCheck(String productId, BigDecimal price, MoneyTypes moneyType) {
        // TODO
        return true;
    }
}
