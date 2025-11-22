package com.akshita.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	//there are 4 ways to do the below thing
	//see other ways in the following applications - _021, _022 etc.
	
	@RequestMapping("/home")
	public ModelAndView displayInfo() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Learning Aptitude is Fun!");
		mav.setViewName("index");		
		return mav;
	}
	
	//Earlier there were only RequestMapping till spring 4, and we used to specify get, put, post etc as attribute in annotation
	//We can use any of the RequestMapping or Get/PostetcMapping at method level
	//But recommnded one is Get/PostMapping at method level
	
	//At class level, (i.e. where we have written @Controller annotation), we have to use RequestMapping only, there Get/Post etc don't work
	//When we have multiple controllers then we have to use class level mapping to specify which controller the request should go to, 
	//and then the following url path identifies that to which method of this controller the request should go to 
	
	@GetMapping("/test") 
	public ModelAndView displayInfo2() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Learning Aptitude is Fun!");
		mav.setViewName("test");		
		return mav;
	}
	
	//for testing if controller is working
//	@RequestMapping("/")
//	@ResponseBody
//	public String test() {
//	    return "Controller is working";
//	}
	
	
}
