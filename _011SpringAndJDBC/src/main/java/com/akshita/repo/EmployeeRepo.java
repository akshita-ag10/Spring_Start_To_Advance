package com.akshita.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akshita.model.Employee;

@Repository
public class EmployeeRepo implements IEmployeeRepo {
	
	//SPRING + JDBC 
	
	@Autowired
	DataSource dataSource ;
	

	@Override
	public List<Employee> getEmployeeInfo() {
		System.out.println("The name of implementation class of DataSource interface is ; " + dataSource.getClass().getName());
		
		String SQLQuery = "SELECT * FROM employee";
		
		List<Employee> empL = new ArrayList<>() ;
		
		try {
			//JDBC Code
			Connection connection = dataSource.getConnection();
			PreparedStatement pstmnt = connection.prepareStatement(SQLQuery);
			ResultSet rs = pstmnt.executeQuery();
			
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setCity(rs.getString(3));
				
				empL.add(emp);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return empL;
	}

}
