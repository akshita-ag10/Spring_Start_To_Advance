package service;

public class SpringbootCourse implements ICourse{
	public boolean buyTheCourse(double amount) {
		System.out.println("Spring course is purchased and fees paid is " + amount);
		return true;
	}
}
