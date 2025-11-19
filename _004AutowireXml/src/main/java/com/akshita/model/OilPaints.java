package com.akshita.model;

//Dependant class
public class OilPaints implements IColors{
	public OilPaints() {
		System.out.println("OilPaints bean created");
	}
	public boolean paint() {
		System.out.println("Painting with Oil Paints");
		return true;
	}
}
