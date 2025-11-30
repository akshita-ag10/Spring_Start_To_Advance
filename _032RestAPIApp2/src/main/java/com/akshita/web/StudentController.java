package com.akshita.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akshita.model.Student;

@RestController
public class StudentController {
	
	@GetMapping("/get-student")
	public ResponseEntity<Student> getStudent(){
		Student s = new Student(2, "Akshita", "Delhi", 15);
		return new ResponseEntity<Student> (s, HttpStatus.OK);
	}
	
	//this is not at all recommended, writing this just for understanding that both are able to process JSON object, Java to JSON and JSON to Java does not depend on ResponseEntity class
	@GetMapping("/get-student2")
	public Student getStudent2() {
		Student s = new Student(3, "Rohit", "Pune", 16);
		return s;
	}
	
	
	//so the above 2 methods are working, they are giving JSON data on browser
	//we are not writing any extra code to convert java object to JSON, just adding @RestController annotation
	//this is because, springboot app has jakson dependency already automatically
	//jakson jar files has the implementation for this coversion of Java obj to JSON & JSON to Java object
	
	//now to see how jakson lib work, see _033 and _034, these 2 are maven projects with just core java

	
	@PostMapping("/register-student")
	public ResponseEntity<String> registerStudent(@RequestBody Student s) {
		//actually we would have to save the student we are getting in db, but as now let's just print
		System.out.println(s);
		return new ResponseEntity<String>("Student has been registered successfully", HttpStatus.CREATED);
	}
	
	//when we pass student s from request body, it is in json format, there if we pass some extra field like country
	//then country is not there as a property in our model class - Student
	//if it would have been a simple java application than we would have to use @JsonIgoreProeprties, see _034
	//here in in spring boot it automatically takes care of it.
	
	//case 2 - if some field is not passed, like value for age field is not passed from JSON
	//then in java object it will store it as age=null or age=0 if primitvie datatype
	
	
}
