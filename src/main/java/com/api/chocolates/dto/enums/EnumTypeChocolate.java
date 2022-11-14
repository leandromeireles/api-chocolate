package com.api.chocolates.dto.enums;

public enum EnumTypeChocolate {

    CHOCOLATETYPEA("A"),
    CHOCOLATETYPEB("B"),
    CHOCOLATETYPEC("C");

    private final String typeChocolate;
    EnumTypeChocolate(String typeChocolate) {

        this.typeChocolate = typeChocolate;

    }

    public static EnumTypeChocolate getByValue(String value) {
        for (EnumTypeChocolate dt : EnumTypeChocolate.values()) {
            if (dt.typeChocolate.equals(value)) {
                return dt;
            }
        }
        throw new IllegalArgumentException("no EnumTypesChocolate with " + value + " exists");
    }

    public static EnumTypeChocolate getByName(String name) {
        for (EnumTypeChocolate dt : EnumTypeChocolate.values()) {
            if (dt.name().toLowerCase().equals(name.toLowerCase())) {
                return dt;
            }
        }
        throw new IllegalArgumentException("no EnumTypesChocolate with name " + name + " exists");
    }
}
