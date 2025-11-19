package com.akshita.service;

import org.springframework.stereotype.Service;

@Service
public class AcrylicColors implements IColors{
	
	public AcrylicColors() {
		System.out.println("AcrylicColors bean created");
	}

	@Override
	public boolean getColors(double amount) {
		System.out.println("Acrylic Colors bought by the Artist for " + amount);
		return true;
	}

}
