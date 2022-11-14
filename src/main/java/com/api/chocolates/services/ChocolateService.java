package com.api.chocolates.services;

import com.api.chocolates.dto.PercentageDTO;

public interface ChocolateService {

    PercentageDTO getPercentageCocoa(String typeChocolate);
}

