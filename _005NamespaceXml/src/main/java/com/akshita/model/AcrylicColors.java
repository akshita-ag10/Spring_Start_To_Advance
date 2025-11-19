package com.akshita.model;

public class AcrylicColors implements IColors{
	public AcrylicColors() {
		System.out.println("AcrylicColors bean created");
	}

	public boolean paint() {
		System.out.println("Painting with Acrylic Colors");
		return true;
	}

}
