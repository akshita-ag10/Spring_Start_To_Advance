package com.akshita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.akshita.service.Artist;

@SpringBootApplication //this annotation is = @ComponentScan + @AutoConfiguration
					   //@ComponentScan is to specify the package in which Spring needs to look for classes to create beans
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Application.class, args);
		
		Artist artist = container.getBean(Artist.class);
		artist.buyColors(450);
		
	}

}
