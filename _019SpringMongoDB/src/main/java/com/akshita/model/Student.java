package com.akshita.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
	
	@Id
	private String id;
	private int roll;
	private String name;
	private String city;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", roll=" + roll + ", name=" + name + ", city=" + city + "]";
	}
	public Student(String id, int roll, String name, String city) {
		super();
		this.id = id;
		this.roll = roll;
		this.name = name;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
