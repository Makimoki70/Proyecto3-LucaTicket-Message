package com.proyecto.spring.message.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.proyecto.spring.message.model.Message;

@Service
public class VadidateService {
	
	private Message paymentOk(){
		return new Message("200", "Pago realizado correctamente");
	}
	
	private Message paymentExpired(){
		return new Message("400.1454", "El link del pago ha expirado. Intentalo de nuevo");
	}
	
	private Message invalidCurrency(){
		return new Message("400.1030", "Tipo de moneda no válida para este pago.");
	}
	
	private Message providerBusy(){
		return new Message("500.1049", "El proveedor está ocupado.Por favor, pruebe más tarde");
	}
	
	private Message databaseError(){
		return new Message("500.3004", "Expirado tiempo de validacion de PaysafeCard. Intentalo de nuevo.");
	}
	
	public Message randomResponse(){
		int rnd = new Random().nextInt(0, 5);
		switch(rnd) {
		case 0: return paymentOk();
		case 1: return paymentExpired();
		case 2: return invalidCurrency();
		case 3: return providerBusy();
		case 4: return databaseError();
		default: return paymentOk();
		}
	}
}