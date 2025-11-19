package model;

import org.springframework.stereotype.Service;

@Service
public class SpringBootCourse implements ICourse{
	public SpringBootCourse() {
		System.out.println("SpringBootCourse bean created");
	}
    
    public boolean getTheCourse(Double amount) {
        System.out.println("Springboot Course purchased for amount "+amount);
        return true;
    }


}
