package com.akshita.service;
//A class that uses another class logic - is caller target class
//Coaching is Target Class
public class Coaching {
	private ICourse course;
	
	public boolean getTheCourse(double amount) {
		
//		JavaCourse jc = new JavaCourse();
//		jc.buyTheCourse(55);
		
		return course.buyTheCourse(amount);
		
		
	}

}
