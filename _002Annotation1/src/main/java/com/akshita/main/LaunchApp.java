package com.akshita.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.akshita.config.Password;
//INTERVIEW QUESTIONS
//@Controller v/s @RestController

//1. Stereotype Annotations - Annotations that are for class, when we write these annotations on any class, spirng will createt the object of that class for us
//@Component - spring will create bean for the class,// id of bean : either specify it or spring will use camel-case of class name
//@Controller , @RestController, @Service, @Repository - all these annotations are @Component + some special feature
//@Controller, @RestController = @Component + Its weblogic
//@Service = @Component + Its business login
//@Repository = @Component + Its Dao logic

//2.
//@Configuration - does not come under Stereotype but it also creates obj of the class 
//@Configuration = @Component + It has configurations
public class LaunchApp {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationConfig.xml");
		
		Password p = container.getBean(Password.class);
		System.out.println("Algo used is " + p.getAlgo());
	}
}
