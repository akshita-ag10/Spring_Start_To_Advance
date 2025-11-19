package com.akshita.service;

public class Coaching {
    ICourse course;
    public void setCourse(ICourse course){
        this.course= course;
        System.out.println("Setter injection performed");
    }
    
    public Coaching() {
    	System.out.println("Coaching bean created");
    }
    public Coaching(ICourse course) {
    	this.course = course;
    	System.out.println("Coaching bean created via parameterized constructor");
    	System.out.println("Constructor injection performed");
    }

    public boolean buyTheCourse(Double amount){
        return course.getTheCourse(amount);
    }
}
