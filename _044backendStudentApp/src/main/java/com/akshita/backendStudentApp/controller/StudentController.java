package com.akshita.backendStudentApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akshita.backendStudentApp.entity.Student;
import com.akshita.backendStudentApp.service.IStudentService;

@RestController
@RequestMapping("/api")
//specifying on controller level is ok for small application, but generally an app would have multiple controllers, so better to build a config class

//@CrossOrigin(origins="http://localhost:5173") //since we are running the react app on our system, this is the url, if the react app would be live, we would put that url here
//we can specify multiple origins also, in that case pass them as an array,  "," separated 

//we can also specify the cross origins pattern to allow subdomains etc.
//@CrossOrigin(originPatterns= {"http://localhost:*","https://*.myapp.com"})

//if wanna specify both origins and originPatterns
//@CrossOrigin(
//	    origins = "http://localhost:3000",
//	    originPatterns = {
//	        "http://localhost:*",
//	        "https://*.myapp.com"
//	    }
//	)
public class StudentController {
	
	@Autowired
	IStudentService stuService;
	
	//can specify the cross origins on method level
//	@CrossOrigin(origins = {
//	        "http://localhost:3000",
//	        "http://localhost:4200"
//	    })
	@GetMapping("/Students") //we should return in response entity, but here we are doing directly
	public List<Student> getAllStudents(){
		return stuService.getAllStudents();
	}
	
	@PostMapping("/Student")
	public Student registerStudent(@RequestBody Student s) {
		return stuService.saveStudent(s);
	}
	
	@PostMapping("/Student/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Long id){
		Student stu = stuService.getStudentById(id);
//		return new ResponseEntity<Student>(stu, HttpStatus.OK);
		return ResponseEntity.ok(stu); //same thing as above line
	}
	
	@PutMapping("/Student/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student s){
		Student stu = stuService.updateStudent(id, s);
		return ResponseEntity.ok(stu);
	}
	
	@DeleteMapping("/Student/{id}")
	public ResponseEntity<Student> deleteStudentById(@PathVariable Long id){
		stuService.deleteStudentById(id);
		return ResponseEntity.noContent().build();
	}

}
