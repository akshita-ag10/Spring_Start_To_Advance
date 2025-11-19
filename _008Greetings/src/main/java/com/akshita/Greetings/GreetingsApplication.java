package com.akshita.Greetings;

import java.time.LocalTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.akshita.Greetings.service.GenerateGreetings;

@SpringBootApplication
public class GreetingsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(GreetingsApplication.class, args);
		
		GenerateGreetings ServiceGG = container.getBean(GenerateGreetings.class);
		
		String res = ServiceGG.getGreetings("Madam Ji");
		System.out.println(res);
		
		
		
	}

}
