package com.akshita.model;

import org.springframework.stereotype.Service;

//Dependant class
@Service
public class AcrylicColors implements IColors{
	public AcrylicColors() {
		System.out.println("Acrylic Colors bean created");
	}

	public boolean paint() {
		System.out.println("Painting with Arcylic Colors");
		return true;
	}
}
