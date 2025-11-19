package com.akshita;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.akshita.model.Employee;
import com.akshita.repo.EmployeeRepo;
import com.akshita.repo.EmployeeRepo2;

@SpringBootApplication
public class Application {

	private static final String EmployeeRepo = null;

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Application.class, args);
	
		
		EmployeeRepo2 empRepo2 = container.getBean(EmployeeRepo2.class);
		Employee e = new Employee(12, "Bheem", "Dholkapur");
		empRepo2.inputEmp(e);
		
		
		EmployeeRepo empRepo = container.getBean(EmployeeRepo.class);
		
//		List<Employee> eList= empRepo.getEmployeeInfo();
//		Iterator itr = eList.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		empRepo.getEmployeeInfo().forEach(em->System.out.println(em));
		
	}

}
