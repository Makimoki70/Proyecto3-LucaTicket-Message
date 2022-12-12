package com.proyecto.spring.message.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
	
    @Bean
    public OpenAPI MessageOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Message API")
                .description("Documentación de la Message API")
                .version("v1.0")
                .contact(new Contact().name("Alberto Egea").
                        url("https://alberto.es").email("alberto.egea.garcia97@gmail.com"))
                .license(new License().name("LICENSE").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                .description("Microservicio Message, el cual manda un mensaje de estado de la compra como String hasta Ticket")
                .url("https://miproyecto.es"));
    }
	

}
