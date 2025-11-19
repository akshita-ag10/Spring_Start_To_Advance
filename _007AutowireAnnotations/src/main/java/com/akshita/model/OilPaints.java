package com.akshita.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//Dependant class
@Service
@Primary
public class OilPaints implements IColors{
	public OilPaints() {
		System.out.println("OilPaints bean created");
	}
	public boolean paint() {
		System.out.println("Painting with Oil Paints");
		return true;
	}
}
