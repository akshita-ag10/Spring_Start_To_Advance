package com.akshita.model;

//target class
public class Artist {
	IColors col ;
	
	public void setCol(IColors color) {
		System.out.println("Setter injection");
		this.col = color;
	}
	
	public Artist() {
		System.out.println("Artist bean created");
	}
	public Artist(IColors color) {
		System.out.println("Artist bean created via paramertized consturctor");
		System.out.println("Constructor Injection");
		this.col = color;
	}
	
	public boolean chooseColors() {
		return col.paint();
		
	}
	

}
