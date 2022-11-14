package com.api.chocolates;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
        title = "Test Developer",
        version = "1.0",
        description = "Documents from API"

))
public class ApiChocolatesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiChocolatesApplication.class, args);
    }

}
