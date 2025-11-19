package com.akshita.service;

public class SpringbootCourse implements ICourse{
	
	public SpringbootCourse() {
		System.out.println("SpringbootCourse bean created");

	}
	
	public boolean buyTheCourse(double amount) {
		System.out.println("Spring course is purchased and fees paid is " + amount);
		return true;
	}
}
