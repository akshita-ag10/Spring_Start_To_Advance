package com.akshita.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	public Config() {
		System.out.println("Config bean created");
	}
	
	//@Bean //sometimes we have to create obj ourselves and still we want Spring to handle it as other beans, 
	     // then we write one method that return the obj of that class and use Annotation @Bean on it.
	@Bean
	public Password createPasswordObj() {   //we are not writing 'new Password()' anywhere else, nor we are calling this 'createPasswordObj' anywhere in the code, then also obj is being created, it is being done by Spring
											//Spring is creating the bean of Password class and we are able to get it in LaunchApp class and use the obj dependant (Non-static) properties and methods
		Password pass = new Password("SHA");
		return pass;
	}

}
