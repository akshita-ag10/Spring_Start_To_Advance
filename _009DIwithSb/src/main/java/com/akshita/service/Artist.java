package com.akshita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Artist {
	
	public Artist() {
		System.out.println("Artist bean created");
	}
	
	@Autowired
	@Qualifier("waterColors")
	IColors colors;
	
	public void buyColors(double amount) {
		boolean status = colors.getColors(amount);
		if(status)
			System.out.println("Colors bought successfully");
		else
			System.out.println("Failed to buy Colors");
	}

}
