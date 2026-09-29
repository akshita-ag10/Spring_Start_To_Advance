package com.akshita.SpringHATEOS.controllers;


import java.util.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.akshita.SpringHATEOS.model.Course;

@RestController
@RequestMapping("/courses")
//we should search from db using service layer but here we are creating course here only
public class CourseController {

	
	//to test - put this in postman => http://localhost:8080/courses/1
	@GetMapping("/{id}")
	public ResponseEntity<Course> getCourse(@PathVariable("id") int id){
		
		Course c = new Course(id, "Java", 4555.4);
		Link devClink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CourseController.class).devCourses())
				.withRel("get-dev-courses");
		Link aptiClink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CourseController.class).aptitudeCourses())
				.withRel("get-apti-courses");
		Link allClink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CourseController.class).allCourses())
				.withRel("get-all-courses");
		
		//where is this 'add' method coming from in course class that is accepting Link datatype, it was just a pojo class
		//it is coming from RepresentationModel class (part of Spring HATEOS) being extended by Course class
		c.add(devClink);
		c.add(aptiClink);
		c.add(allClink);
		
		//in mthodon we are specifying that this class
		//in withrel we are specifying the endpoint for that method
		return new ResponseEntity<Course>(c,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/get-dev-courses")
	public ResponseEntity<List<Course>> devCourses(){
		List<Course> list = new ArrayList<>();
		list.add(new Course(2, "AI/ML", 555.5));
		list.add(new Course(3, "DevOps", 6000.0));
		list.add(new Course(4, "Springboot", 10000.8));
		
		return new ResponseEntity<List<Course>> (list, HttpStatus.OK);
	}
	
	@GetMapping("/get-apti-courses")
	public ResponseEntity<List<Course>> aptitudeCourses(){
		List<Course> list = new ArrayList<>();
		list.add(new Course(5, "Logical Reasoning", 1000.5));
		list.add(new Course(6, "Quantitative Aptitude", 2000.0));
		
		return new ResponseEntity<List<Course>> (list, HttpStatus.OK);
	}
	
	@GetMapping("/get-all-courses")
	public ResponseEntity<List<Course>> allCourses(){
		List<Course> list = new ArrayList<>();
		list.add(new Course(2, "AI/ML", 555.5));
		list.add(new Course(3, "DevOps", 6000.0));
		list.add(new Course(4, "Springboot", 10000.8));
		list.add(new Course(5, "Logical Reasoning", 1000.5));
		list.add(new Course(6, "Quantitative Aptitude", 2000.0));
		
		return new ResponseEntity<List<Course>> (list, HttpStatus.OK);
	}
	
}
