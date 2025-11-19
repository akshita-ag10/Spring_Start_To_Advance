package com.akshita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.akshita.service.BikeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Application.class, args);
		
		BikeService bservice = container.getBean(BikeService.class);
		
		bservice.fetchByPriceLessThan(210000).forEach(rv -> System.out.println(rv.getBrand() + " - " + rv.getModelName()));;
		
		
		
	}

}
