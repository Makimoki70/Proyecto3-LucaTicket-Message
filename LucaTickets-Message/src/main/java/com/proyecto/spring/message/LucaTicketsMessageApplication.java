package com.proyecto.spring.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LucaTicketsMessageApplication {

	public static void main(String[] args) {
		SpringApplication.run(LucaTicketsMessageApplication.class, args);
	}

}
