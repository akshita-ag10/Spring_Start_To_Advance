package com.akshita.service;

public class DevOpsCourse implements ICourse{
	public DevOpsCourse() {
		System.out.println("DevOps bean created");
	}
    @Override
    public boolean getTheCourse(Double amount) {
        System.out.println("Devops Course purchased for amount "+amount);
        return true;
    }
}
