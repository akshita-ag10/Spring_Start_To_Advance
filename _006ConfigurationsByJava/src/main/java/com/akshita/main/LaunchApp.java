package com.akshita.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akshita.config.Config;
import com.akshita.config.Password;

//the only diff between this app and _002Annotation1 app is that there we used applicationConfig.xml file 
//and here we did not use any xml file at all
public class LaunchApp {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
		//instead of xml file, we are doing configurations in java class
	
		Password pw = container.getBean(Password.class);
		System.out.println("Algo used is "+ pw.getAlgo());
	}
}
