/**
 * 
 */
package service;

/**
 * @author HP
 *
 */
public class DevOpsCourse implements ICourse{
	public boolean buyTheCourse(double amount) {
		System.out.println("DevOps course is purchased and fees paid is " + amount);
		return true;
	}
}
