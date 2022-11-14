package com.api.chocolates.handler;


import com.api.chocolates.services.ChocolateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.Optional;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class PercentageCocoaHandler {
	
	@Autowired
	ChocolateService service;


	public Mono<ServerResponse> getPercentageCocoa(ServerRequest request){

		Optional<String> typeChocolate = request.queryParam("typeChocolate");

		return ok()
				.contentType(MediaType.APPLICATION_JSON)
				.bodyValue(service.getPercentageCocoa(typeChocolate.get()));
	}

}
