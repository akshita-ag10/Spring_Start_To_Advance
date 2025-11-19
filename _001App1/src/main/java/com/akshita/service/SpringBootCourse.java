package com.akshita.service;

public class SpringBootCourse implements ICourse{
	public SpringBootCourse() {
		System.out.println("SpringBootCourse bean created");
	}
    @Override
    public boolean getTheCourse(Double amount) {
        System.out.println("Springboot Course purchased for amount "+amount);
        return true;
    }
}
