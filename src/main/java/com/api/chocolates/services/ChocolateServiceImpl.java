package com.api.chocolates.services;

import com.api.chocolates.dto.PercentageDTO;
import com.api.chocolates.dto.enums.EnumTypeChocolate;
import com.api.chocolates.factory.ChocolateTypeFactory;
import org.springframework.stereotype.Service;

@Service
public class ChocolateServiceImpl implements ChocolateService {
    @Override
    public PercentageDTO getPercentageCocoa(String typeChocolate) {

        PercentageCocoa percentageCocoa = ChocolateTypeFactory.createInstance(EnumTypeChocolate.getByValue(typeChocolate));

        PercentageDTO percentageDTO = PercentageDTO.builder().percentChocolate(percentageCocoa.getPercentageCocoa(typeChocolate)).build();

        return percentageDTO;
    }
}
