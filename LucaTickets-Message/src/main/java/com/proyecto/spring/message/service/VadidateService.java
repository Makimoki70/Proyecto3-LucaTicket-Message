package com.proyecto.spring.message.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.proyecto.spring.message.model.Message;

/**
 * 
 * Nombre de clase: ValidateService
 * Descripcion: Clase de la capa service, guarda los cinco mensajes aleatorios a los cuales accedera el microservicio.
 * Fecha: 12/12/2022
 * @author Alberto Egea.
 * @version 0.1
 * @since 0.1
 * 
 * */
@Service
public class VadidateService {
	
	/**
     * Metodo paymentOk.
     * @return unico mensaje positivo, codigo 200, el pago se realizo correctamente
     */
	private Message paymentOk(){
		return new Message("200", "Pago realizado correctamente");
	}
	
	/**
     * Metodo paymentExpired.
     * @return codigo 400, pago expirado
     */
	private Message paymentExpired(){
		return new Message("400.1454", "El link del pago ha expirado. Intentalo de nuevo");
	}
	
	/**
     * Metodo invalidCurrency.
     * @return codigo 400, moneda no valida
     */
	private Message invalidCurrency(){
		return new Message("400.1030", "Tipo de moneda no válida para este pago.");
	}
	
	/**
     * Metodo providerBusy.
     * @return codigo 500, servidor sobrecargado
     */
	private Message providerBusy(){
		return new Message("500.1049", "El proveedor está ocupado.Por favor, pruebe más tarde");
	}
	
	/**
     * Metodo databaseError
     * @return codigo 999, Error en la DataBase
     */
	private Message databaseError(){
		return new Message("999.9998", "Error en la base de datos.");
	}
	
	/**
     * Metodo randomResponse. Encargado de elegir mediante un random, cual de las 5 opciones sera devuelta en la venta de ticket
     * @return uno de los mensajes anteriores
     */
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