package com.api.chocolates.controllers;

import com.api.chocolates.dto.PercentageDTO;
import com.api.chocolates.services.ChocolateService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "chocolate")
@Api(value = "chocolate")
public class ChocolateController {

    @Autowired
    public ChocolateService chocolateService;

    @GetMapping
    public PercentageDTO getPercentageCocoa(@RequestParam String typeChocolate){

        return chocolateService.getPercentageCocoa(typeChocolate);
    }
}
