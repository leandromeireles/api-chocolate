package com.api.chocolates.router;


import com.api.chocolates.dto.PercentageDTO;
import com.api.chocolates.handler.PercentageCocoaHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springdoc.core.annotations.RouterOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class PercentageCocoaRouter {

	@Bean
	@RouterOperation(
			path = "/chocolate",
			produces = {
					MediaType.APPLICATION_JSON_VALUE
			},
			method = RequestMethod.GET,
			beanClass = PercentageCocoaHandler.class,
			beanMethod = "getPercentageCocoa",
			operation = @Operation(

					operationId = "getPercentageCocoa",
					responses = {
							@ApiResponse(
									responseCode = "200",
									description = "successful operation",
									content = @Content(schema = @Schema(
											implementation = PercentageDTO.class
									))


							)
					}
			)
	)
	public RouterFunction<ServerResponse> route(PercentageCocoaHandler handler){
		return RouterFunctions.route(GET("/chocolate")
					.and(queryParam("typeChocolate", t -> true))
					.and(accept(MediaType.APPLICATION_JSON)), handler::getPercentageCocoa);
			
	}

}
