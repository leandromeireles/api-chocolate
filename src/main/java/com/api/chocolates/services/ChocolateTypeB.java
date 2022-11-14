package com.api.chocolates.services;

import org.springframework.stereotype.Component;

@Component
public class ChocolateTypeB implements PercentageCocoa {

    public static final String EIGHTY_FIVE_PERCENT   = "85%";
    @Override
    public String getPercentageCocoa(String typeChocolate) {


        return EIGHTY_FIVE_PERCENT;
    }
}
