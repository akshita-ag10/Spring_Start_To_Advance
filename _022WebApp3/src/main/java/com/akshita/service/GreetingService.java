package com.akshita.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {
	
	
	@Autowired
	LocalDateTime time;

	@Override
	public String letsGreet(String name) {
		int hour = time.getHour();
		
		if(hour<12) {
			return "Hello " + name + "! Good Morning.";
		}else if(hour<16) {
			return "Hello " + name + "! Good Afternoon.";
		}else if(hour<20) {
			return "Hello " + name + "! Good Evening.";
		}
		return "Hello " + name + "! Good Night.";
	}

}
