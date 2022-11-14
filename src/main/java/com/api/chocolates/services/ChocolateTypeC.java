package com.api.chocolates.services;

import org.springframework.stereotype.Component;

@Component
public class ChocolateTypeC implements PercentageCocoa {

    public static final String NINETY_PERCENT   = "90%";
    @Override
    public String getPercentageCocoa(String typeChocolate) {


        return NINETY_PERCENT;
    }
}
