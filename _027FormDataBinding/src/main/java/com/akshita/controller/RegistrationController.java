package com.akshita.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.akshita.model.Student;

@Controller
public class RegistrationController {

	//here we are seeing how to get data from Form to our Spring applicaiton
	//here we are just displaying it via jsp page, but obv we can pass that data to service layer and do operations or may store in db if needed
	//here we are not using @RequestBody b/c that is used in restapi, here we are just using model and view and getting form data from ui to backend
	//why we use rest api is b/c we want to work with json data, both receiving and sending of data
	//here the data in model and view can only be processed in java application, that is why here we can only use either jsp or thymeleaf
	
	@GetMapping("/register")
	public String registerStudent(Model m) {
		return "register";
	}
	
	
	@PostMapping("/register")
	public String registerStudent(Map<String, Object> map, @ModelAttribute("stu") Student s) {
		//here we are taking the data from Form and asking spring boot to fit that data in Studnet object
		//we don't have to do manually as we used to do when we used to work with servlets
		//like request.getparameter...etc etc
		//it automatically maps the form data to Student class properties
		//and then we can either store student obj in db or do any thing in service layer
		//here we are just sending it jsp page, hence we took map in attribute, otherwise that was not required here
		map.put("student", s);
		return "registered";
	}
}
