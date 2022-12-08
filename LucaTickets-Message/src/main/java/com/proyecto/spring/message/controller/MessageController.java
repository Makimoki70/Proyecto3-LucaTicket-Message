package com.proyecto.spring.message.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.spring.message.model.Message;
import com.proyecto.spring.message.service.VadidateService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/message")
public class MessageController {
	
	@Autowired
	private VadidateService validateService;
	
	@Operation(summary = "Devolver validacion del pago", description = "Devuelve un mensaje con el estado el pago", tags= {"message"})
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Mensaje devuelto", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Message.class)) }),
			@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Message.class)) }),
			})
	@GetMapping
	public Message validatePayment() {
		return validateService.randomResponse();
	}
}
