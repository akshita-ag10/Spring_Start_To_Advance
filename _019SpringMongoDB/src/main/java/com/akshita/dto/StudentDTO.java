package com.akshita.dto;

public class StudentDTO {

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
		return "StudentDTO [id=" + id + ", roll=" + roll + ", name=" + name + ", city=" + city + "]";
	}
	
}
