package com.akshita;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class AnyClass {
	
	static {
		System.out.println("Static block executed");
	}
	
	{
		System.out.println("Non-static block executed");
	}
	
	public AnyClass() {
		System.out.println("Constructor body");
	}
	
	//automatically executed after the constructor body is executed ( no need to invoke these methods separately)
	@PostConstruct
	void hehe() {
		//we keep 'critical code that needs to be executed just after bean is created' here
		System.out.println("Post-constructor method executed");
	}
	
	void disp() {
		System.out.println("Disp method invoked");
	}
	
	//automatically executed just before closing the application ( no need to invoke these methods separately)
	@PreDestroy
	void haha() {
		//we keep resource closure code here
		//executed before the closure of IOC container
		System.out.println("Pre-destroy method executed");
	}

}
