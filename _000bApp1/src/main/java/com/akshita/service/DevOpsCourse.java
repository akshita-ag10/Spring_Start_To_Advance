package com.akshita.service;

public class DevOpsCourse implements ICourse{
	
	public DevOpsCourse(){
		System.out.println("DevOps bean course created");
	}
	
	public boolean buyTheCourse(double amount) {
		System.out.println("DevOps course is purchased and fees paid is " + amount);
		return true;
	}
}
