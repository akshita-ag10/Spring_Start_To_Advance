package com.akshita.model;

import org.springframework.stereotype.Service;

//Dependant class
@Service
public class WaterColors implements IColors{
	public WaterColors() {
		System.out.println("Water Colors bean created");
	}
	public boolean paint() {
		System.out.println("Painting with Water Colors");
		return true;
	}

}
