package com.akshita.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.akshita.model.Artist;


//INTERVIEW QUES
//how to avoid ambiguity in dependancy injeciton
//ans - @Qualifier or @Primary annotation, most of the time you will see @Qualifier being used
public class LaunchApp {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationConfig.xml");
		
		Artist artist = container.getBean(Artist.class);
		
		boolean status = artist.chooseColors();
		
		if(status)
			System.out.println("A beautiful painting is ready");
		else
			System.out.println("Arre, choose the color bro!!");
	}

}
