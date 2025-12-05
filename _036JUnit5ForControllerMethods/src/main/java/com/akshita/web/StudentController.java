package com.akshita.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akshita.model.Student;
import com.akshita.service.IStudentService;

@RestController
public class StudentController {
	
	@Autowired
	private IStudentService studentService;
	
	@GetMapping("/get-student")
	public ResponseEntity<Student> getStudent(){
		Student stu = studentService.fetchStudent();
		return new ResponseEntity<Student> (stu, HttpStatus.OK);
	}
	
	
	
	@PostMapping("/register-student")
	public ResponseEntity<String> registerStudent(@RequestBody Student s) {
		//actually we would have to save the student we are getting in db, but as now let's give it to service layer and print
		System.out.println(studentService.saveStudent(s));
		return new ResponseEntity<String>("Student has been registered successfully", HttpStatus.CREATED);
	}
	
	
}
