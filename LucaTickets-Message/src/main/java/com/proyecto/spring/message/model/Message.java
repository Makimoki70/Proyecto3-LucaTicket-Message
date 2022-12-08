package com.proyecto.spring.message.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Message implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String status;
	private String body;
}
