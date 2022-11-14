package com.api.chocolates.router;

import com.api.chocolates.dto.PercentageDTO;
import com.api.chocolates.handler.PercentageCocoaHandler;
import com.api.chocolates.services.ChocolateService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@WebFluxTest({PercentageCocoaRouter.class, PercentageCocoaHandler.class})
public class PercentageCocoaRouterTest {

    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private ChocolateService service;

    private final String TEST_TYPE_A = "A";

    private final String TEST_TYPE_B = "B";

    private final String TEST_TYPE_C = "C";

    @Test
    public void testTypeChocolateA() {

        PercentageDTO percentageDTO = PercentageDTO.builder().percentChocolate("80%").build();

        when(service.getPercentageCocoa(TEST_TYPE_A)).thenReturn(percentageDTO);

        var x= webTestClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/chocolate")
                        .queryParam("typeChocolate", TEST_TYPE_A)
                        .build())
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectBody();


    }

    @Test
    public void testTypeChocolateB() {

        PercentageDTO percentageDTO = PercentageDTO.builder().percentChocolate("85%").build();

        when(service.getPercentageCocoa(TEST_TYPE_B)).thenReturn(percentageDTO);

        var x= webTestClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/chocolate")
                        .queryParam("typeChocolate", TEST_TYPE_B)
                        .build())
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectBody();


    }

    @Test
    public void testTypeChocolateC() {

        PercentageDTO percentageDTO = PercentageDTO.builder().percentChocolate("90%").build();

        when(service.getPercentageCocoa(TEST_TYPE_C)).thenReturn(percentageDTO);

        var x= webTestClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/chocolate")
                        .queryParam("typeChocolate", TEST_TYPE_C)
                        .build())
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectBody();


    }
}