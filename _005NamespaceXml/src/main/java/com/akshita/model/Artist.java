package com.akshita.model;

public class Artist {
	private String name;
	private int age;
	private IColors col ;
		
	public Artist() { //even if we make it as private or protected or default, then also spring is able to access the constructor and create the bean
		System.out.println("Artist bean created");
	}
	public Artist(String name, int age, IColors color) { //even if we make it as private or protected or default, then also spring is able to access the constructor and create the bean
		System.out.println("Artist bean created via Paramertized constructor");
		System.out.println("Constructor Injection");
		this.name=name;
		this.age=age;
		this.col = color;
	}
	
	public boolean paintNow() {
		return col.paint();
	}
	
	//To String method
	@Override
	public String toString() {
		return "Artist [name=" + name + ", age=" + age + ", col=" + col + "]";
	}
	
	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public IColors getCol() {
		return col;
	}

	public void setCol(IColors color) {
		System.out.println("Setter injection");
		this.col = color;
	}

}
