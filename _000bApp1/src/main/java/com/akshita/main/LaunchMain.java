package com.akshita.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.akshita.service.Coaching;

public class LaunchMain {

	private static ApplicationContext container;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		container = new ClassPathXmlApplicationContext("applicationConfig.xml");
		
		Coaching ch = container.getBean(Coaching.class);
		
	}

}
