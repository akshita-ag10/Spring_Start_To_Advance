package com.akshita.model;

public class WaterColors implements IColors{
	public WaterColors() {
		System.out.println("WaterColors bean created");
	}

	public boolean paint() {
		System.out.println("Painting with Water Colors");
		return true;
	}

}
