package com.akshita.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.akshita.model.Student;

//actuators is there to monitor/manage/check your application once it is live on server
//on server, we don't have IDEs to check 
//we can get data like how many beans are running

//we need to add spring boot actuators dependency
//it gives 11 endpoints to get info about your live application
//when you access thoese endpoints (via postman or anything else) you will get the response 
//bydefault only health endpoint is enabled
//to enable other endpoint we need to add properties in our application.properties file


@RestController
public class StudentController {

	@GetMapping("/get-student")
	public ResponseEntity<Student> getStudent() {
		Student s1 = new Student (8, "Sugam", "Meerut", 23);
		return new ResponseEntity<Student>(s1, HttpStatus.OK);
	}
	
	@PostMapping("/add-student")
	public ResponseEntity<Student> addStudent(Student s){
		System.out.println(s);
		return new ResponseEntity<Student>(s,HttpStatus.CREATED);
	}	
	
}
