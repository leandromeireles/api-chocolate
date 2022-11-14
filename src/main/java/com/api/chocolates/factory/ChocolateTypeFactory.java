package com.api.chocolates.factory;

import com.api.chocolates.dto.enums.EnumTypeChocolate;
import com.api.chocolates.services.ChocolateTypeA;
import com.api.chocolates.services.ChocolateTypeB;
import com.api.chocolates.services.ChocolateTypeC;
import com.api.chocolates.services.PercentageCocoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class ChocolateTypeFactory {

    @Autowired
    ChocolateTypeA chocolateTypeA;

    @Autowired
    ChocolateTypeB chocolateTypeB;

    @Autowired
    ChocolateTypeC chocolateTypeC;

    private static Map<EnumTypeChocolate, PercentageCocoa> handler = new HashMap<EnumTypeChocolate,PercentageCocoa>();

    @PostConstruct
    private void init() {

        handler.put(EnumTypeChocolate.CHOCOLATETYPEA,  chocolateTypeA);
        handler.put(EnumTypeChocolate.CHOCOLATETYPEB,  chocolateTypeB);
        handler.put(EnumTypeChocolate.CHOCOLATETYPEC,  chocolateTypeC);

    }

    public static PercentageCocoa createInstance(EnumTypeChocolate typeChocolate) {

        return handler.get(typeChocolate);
    }
}
