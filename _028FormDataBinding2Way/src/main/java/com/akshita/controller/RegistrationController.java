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

	//by 2 way data binding we mean, when user sees the form to fill it, at that time also we want some data to be prefilled from backend, 
	//for eg we have seen such forms where we see some of our basic details pre-filled, it is coming from backend
	
	//and second, after filling the form and submitting, the whole data is shown to user from backend, like the data user filled is saved to db and then displayed to user
	//this is 2 way binding. 2nd part we already did in 027 project, now need to bring some data from backed to form as pre-filled data
	//to this we need from tag lib, since we are already using spring mvc dependency, we need not to include form tag lib dependancy separately
	//however we would still need to include the form tag lib tag in our jsp page
	
	//now what changes we would need, 
	//1st - we would have to refer to the modelAttribute obj in both controller methods, to register and after register
	//so that they are refering to same obj
	//here we will set age as default value and backend bring it to form as pre-filled
	//2nd - in the form in jsp page, how we mention the input tag of form would be diff, instead of type and name, we will specify path and this path will be the var name in modelAttribute obj
	//also in jsp page form, we would mention the modelAttribute
	//for more info- refer to jsp pages
	
	
	@GetMapping("/register")
	public String registerStudent(@ModelAttribute("stu") Student s) {
		//for 2 way binding since here also we need pre-filled data from backend, we need modelAttribute here also
		// @ModelAttribute creates/populates the Student object
		// and adds it to the model as "stu" for form binding.
		
		return "register";
	}
	
	
	@PostMapping("/register")
	public String registerStudent(Map<String, Object> map, @ModelAttribute("stu") Student s) {
		
		map.put("student", s);
		return "registered";
	}
}
