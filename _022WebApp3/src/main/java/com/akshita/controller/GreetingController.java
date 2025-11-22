package com.akshita.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.akshita.service.GreetingService;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class GreetingController {
	
	@Autowired
	GreetingService service;
	
	//here are different ways of writing the model view method to put the data into view object that can be rendered
	
	@GetMapping("/greet1")
	public ModelAndView greet1() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("greet", service.letsGreet("Amit"));
		mav.setViewName("profile");
		return mav;
	}
	
	//RECOMMENDED ONE
	@GetMapping("/greet2")
	public String greet2(Model model) {
		model.addAttribute("greet", service.letsGreet("Bhanu"));
		return "profile";
	}
	
	//RECOMMENDED ONE
	@GetMapping("/greet3")
	public String greet3(Map<String, String> m) {
		m.put("greet", service.letsGreet("Chitvan"));
		return "profile";
	}
	
	//giving error, not sure why
//	@GetMapping("/profile")
//	public void greet4(Map<String, String> map) {
//		map.put("greet", service.letsGreet("Dinesh"));
//	}	//here we are not returning any view name, in such case the url end point should match with view name
	
	//giving error, not sure why
	@GetMapping("/profile")
	public Map<String, String> greet5(){
		Map<String , String> map = new HashMap();
		map.put("greet", service.letsGreet("Esha"));
		return map;
	}	//again, here we are not returning any view name, in such case the url end point should match with view name
	
	@GetMapping("/greet6")
	public void greet6(HttpServletResponse resp) throws IOException { 
		//since we are sure it will not give exception, we are ducking it
		PrintWriter writer = resp.getWriter();
		writer.println(service.letsGreet("Fatima"));
	}
	
	
	
}
