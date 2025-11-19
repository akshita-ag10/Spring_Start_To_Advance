package com.akshita.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bike")
public class Bike {
	
	@Id
	private Integer id;
	private String brand;
	private String modelName;
	private String engine;
	private Double price;
	
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

	@Override
	public String toString() {
		return "Bike [id=" + id + ", brand=" + brand + ", modelName=" + modelName + ", engine=" + engine + ", price="
				+ price + "]";
	}
	
	
	
	
}
