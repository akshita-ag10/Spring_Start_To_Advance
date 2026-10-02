package com.akshita.security2.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.akshita.security2.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {
	
	//session id is stored in client's browser cookies, 
	//second time when req is made, it checks if its for the same session, if yes, it allow it to access data as the user has already been authenticated
	//but this opens a door for malecious website to reach the server with the same session ids
	//so by default spring security allows only to do read operations and CSRF is implemtned for post, put, patch and delete req
	//Concept of CSRF ( Cross Site Request Forgery ) - is implemented by default in spring security for non select operations
	//an extra layer is added for these operations, it asks for CSRF token everytime you come to me
	//we can generate CSRF tokens
	
	List<Student> students = new ArrayList<>(List.of(new Student(1, "Rohan", "java"),
														 new Student(2, "Mohan", "DevOps"),
														 new Student(3, "Sohan", "AI Engineering"))); //we should get it from service and dao layer
		

	
	@GetMapping("/get-students")
	public List<Student> getStudents(){
		return students;
	}	
	
	@PostMapping("/add-student")
	public void addStudents(@RequestBody Student st) {
		students.add(st);
	}
	
	@GetMapping("/get-session-id") 	//for testing stateless behaviour only
	public String getSessionID(HttpServletRequest request) {
		String resp = "Session id is : " + request.getSession().getId();
		return resp;
	}
	
	//put this endpoint in postman to get csrf token and then put that csrf token header for post etc request
	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}
	
	//to stop other malecious sites to access our data by getting the session id from cookies, 
	//we can add some properties in our .properties file, check the file
	

}
