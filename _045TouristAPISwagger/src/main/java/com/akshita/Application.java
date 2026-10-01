package com.akshita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

//add openapi dependency, this is not chatgpt type open ai
//in main class, add @OpenAPIDefinition annotation to specify app title and servers info
//at controller level use @Tag 
//at controller method use @Operation

//to test the apis  either we can use postman or we have swagger ui also 
//swagger also provide documentation and good ui to test, so preferred
//in browser hit => http://localhost:8080/touristapp/swagger-ui/index.html

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="Tourist Info API App",
				version="1.4",
				description="This API is about Tourist Info"
				),
		servers=@Server(
				url="http://localhost:8080/touristapp",
				description="This is the server info where this app is deployed"
				)
		)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
