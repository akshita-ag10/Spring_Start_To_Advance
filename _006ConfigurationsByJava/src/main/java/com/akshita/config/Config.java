package com.akshita.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.akshita"})
public class Config {
	
	public Config() {
		System.out.println("Config bean created");
	}
	
	@Bean
	public Password createPasswordObj() {
		Password pass = new Password("SHA");
		return pass;
	}

}
