package com.akshita.Greetings.service;

import java.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenerateGreetings implements IGreetings{

	String wish;
	
	@Autowired
	LocalTime time;
	
	@Override
	public String getGreetings(String name) {
		
		int hour = time.getHour();
		if(hour < 12 ) {
			wish = "Good Morning, " + name;
		}else if(hour <16) {
			wish = "Good Afternoon " + name;
		}else if(hour < 20) {
			wish = "Good Evening " + name;
		}else {
			wish = "Good Night " + name;
		}
		
		
		return wish;
	}

}
