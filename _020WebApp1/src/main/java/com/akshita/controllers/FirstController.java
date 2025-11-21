package com.akshita.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	//there are 4 ways to do the below thing
	
	@RequestMapping("/home")
	public ModelAndView displayInfo() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Learning Aptitude is Fun!");
		mav.setViewName("index");		
		return mav;
	}
	
	//for testing if controller is working
//	@RequestMapping("/")
//	@ResponseBody
//	public String test() {
//	    return "Controller is working";
//	}
	
	
}
