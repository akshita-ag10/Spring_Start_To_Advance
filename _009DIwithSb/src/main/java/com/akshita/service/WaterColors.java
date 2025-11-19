package com.akshita.service;

import org.springframework.stereotype.Service;

@Service
public class WaterColors implements IColors {
	
	public WaterColors() {
		System.out.println("WaterColors bean created");
	}

	@Override
	public boolean getColors(double amount) {
		System.out.println("WaterColors bought by the Artist for " + amount);
		return true;
	}

}
