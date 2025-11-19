package com.akshita.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.akshita.model.Artist;

//1. see in application context file how to pass values of diff parameters through the xml file configurations
//2. see namespace concept in application context file
public class LaunchApp {
	public static void main(String[]args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		Artist a1 = container.getBean(Artist.class);
		boolean result = a1.paintNow();
		System.out.println(result);
		System.out.println(a1);
	}
	

}
