package com.akshita.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/con2")
public class SecondController {

	@GetMapping("/home") //now here we have same end points and Request Type(GET) as disp() method in first contorller , but it will work b/c class level mapping is diff (/con2) here, so overall url/endpoints are diff
	public String disp(Model model) {
		model.addAttribute("message", "Let's Learn Apptitude - Second Controller");
		return "index";
		
	}
}
