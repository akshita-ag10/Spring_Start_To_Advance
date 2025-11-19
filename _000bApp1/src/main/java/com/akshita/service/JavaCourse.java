package com.akshita.service;

public class JavaCourse implements ICourse{
	
	public JavaCourse() {
		System.out.println("JavaCourse bean created");
	}
	
	public boolean buyTheCourse(double amount) {
		System.out.println("Java course is purchased and fees paid is " + amount);
		return true;
	}
}
