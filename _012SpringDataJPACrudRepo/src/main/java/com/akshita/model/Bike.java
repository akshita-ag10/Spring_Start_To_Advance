package com.akshita.model;

import jakarta.persistence.Entity; //JPA - jakarta persistance api , hibernate also uses it
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;
//JPA makes working with data very easy, the classes are stored as tables in database

@Entity
@Table(name = "bike")
public class Bike {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	String brand;
	String modelName;
	String engine;
	Double price;
	
	
	//Constructors
	public Bike() {
		super();
	}
	public Bike(String brand, String modelName, String engine, Double price) {
		super();
		this.brand = brand;
		this.modelName = modelName;
		this.engine = engine;
		this.price = price;
	}
	
	//Getters & Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	//ToString method
	@Override
	public String toString() {
		return "Bike [id=" + id + ", brand=" + brand + ", modelName=" + modelName + ", engine=" + engine + ", price="
				+ price + "]";
	}
	
	 
	
	

}
