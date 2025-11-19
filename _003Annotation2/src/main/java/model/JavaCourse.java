package model;

import org.springframework.stereotype.Service;

@Service
public class JavaCourse implements ICourse{
	
	public JavaCourse() {
		System.out.println("Java bean created");
	}
    
    public boolean getTheCourse(Double amount) {
        System.out.println("Java Course purchased for amount "+amount);
        return true;
    }
}
