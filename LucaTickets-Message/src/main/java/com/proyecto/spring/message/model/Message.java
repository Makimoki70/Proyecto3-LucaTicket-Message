package com.proyecto.spring.message.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 
 * Nombre de clase: Event.
 * Descripcion: Clase model y DTO del microservicio Message.
 * Fecha: 12/12/2022
 * @author Alberto Egea
 * @version 0.1
 * @since 0.1
 * 
 * */
@Data @AllArgsConstructor
public class Message implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * @param status: Codigo del mensaje
	 * 
	 * */
	private String status;
	
	/**
	 * 
	 * @param body: mensaje completo del mensaje
	 * 
	 * */
	private String body;
}
