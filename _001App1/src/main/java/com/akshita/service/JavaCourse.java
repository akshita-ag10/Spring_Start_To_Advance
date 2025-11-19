package com.akshita.service;

public class JavaCourse implements ICourse{
	
	public JavaCourse() {
		System.out.println("Java bean created");
	}
    @Override
    public boolean getTheCourse(Double amount) {
        System.out.println("Java Course purchased for amount "+amount);
        return true;
    }
}
