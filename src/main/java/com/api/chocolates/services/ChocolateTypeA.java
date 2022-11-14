package com.api.chocolates.services;

import org.springframework.stereotype.Component;

@Component
public class ChocolateTypeA implements PercentageCocoa {

    public static final String EIGHTY_PERCENT   = "80%";
    @Override
    public String getPercentageCocoa(String typeChocolate) {


        return EIGHTY_PERCENT;
    }
}
