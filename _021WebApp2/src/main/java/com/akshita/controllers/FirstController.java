package com.akshita.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.annotation.PostConstruct;

@Controller
@RequestMapping("/con1")
public class FirstController {
	//if we need to cater a request to send just a simple response, we go with GET METHOD 

	//as mentioned in previous proj, there are diff ways of rendering data in view file, here is way 2
	@GetMapping("/home")
	public String disp(Model model) {
		//if you want to see the implementing class of Model
		System.out.println("Implementing class of " + model.getClass().getName());
		model.addAttribute("message", "Let's Learn Apptitude - First Controller");
		return "index";
	}
	//now in above way, we are not creating and returning ModelAndView object.
	//when '/home' endpoints will be hit, disp method will be called by Dispatcher Servlet, 
	//so dispatcher servlet will only be passing the model object and we are addding data to that model object
	//and the string we are returning will be taken as 'logical view name' by dispatcher servlet.
	//so this way dispacther servlet will have have both data and view
	
	
	//if you go by parent of parent and parent, you will find that
	//Map is the parent class of Model, so we can do above thing as below using Map object
	//it is better to use Map, b/c it has less attachment to a particular technology or framework
	//but many interviewer will judge it as wrong, b/c they only don't know this, so don't use it
	@GetMapping("/test")
	public String getTests(Map map) {
		map.put("message", "Let's check our Knowledge - First Controller");
		return "test";
	}
	
	
//	NOTE - we can not have 2 methods for same end points , until the request type is diff, like one is GET and other is POST
	
//	//for checking if controller is working
//	@RequestMapping("/")
//	@ResponseBody
//	public String isItWorking() {
//		return "First controller is Working";
//	}
//	
//	@PostConstruct
//	public void init() {
//	    System.out.println(">>> FirstController Loaded <<<");
//	}
	
}
