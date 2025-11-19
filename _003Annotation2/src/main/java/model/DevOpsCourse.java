package model;

import org.springframework.stereotype.Service;

@Service
public class DevOpsCourse implements ICourse{
	public DevOpsCourse() {
		System.out.println("DevOps bean created");
	}
    
    public boolean getTheCourse(Double amount) {
        System.out.println("Devops Course purchased for amount "+amount);
        return true;
    }
}
