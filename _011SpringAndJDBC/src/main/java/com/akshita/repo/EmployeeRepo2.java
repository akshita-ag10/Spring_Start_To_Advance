package com.akshita.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.akshita.model.Employee;

@Repository
public class EmployeeRepo2 implements IEmployeeRepo{
	
	//SPRING + DATA JDBC
	//That connection part of jdbc code, not need to write yourself when using data JDBC
	//JDBC Template will take care of it
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	String SQLQuery = "INSERT INTO employee (id, name, city) VALUES (?, ?, ?)";
	String SQLQuery2 = "SELECT * FROM employee";
	Employee emp;
	public void inputEmp(Employee e) {
		jdbcTemplate.update(SQLQuery, e.getId(), e.getName(), e.getCity());
	}

	
	@Override
	public List<Employee> getEmployeeInfo() {
		return null;
	}

}
