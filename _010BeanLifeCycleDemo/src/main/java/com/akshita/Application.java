package com.akshita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//spring bean lifecylce is same as java obj lifecycle i.e. - 1. static block executed (when class is loaded)
//															 2. non-static (java-init) block is executed (when obj is created)
//															 3. constructor body is executed (when obj is created but after java init block)
//															 4. methods as per invoking them

//spring bean has 2 extra way  - @PostConstructor and @PreDestroy
//in real time scenarios, these are not used much b/c we have other options also
//but are part of bean life cycle so you should know it

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		 ConfigurableApplicationContext container = SpringApplication.run(Application.class, args);
		 
		 AnyClass ac = container.getBean(AnyClass.class);
		 ac.disp();
	
	}

}
