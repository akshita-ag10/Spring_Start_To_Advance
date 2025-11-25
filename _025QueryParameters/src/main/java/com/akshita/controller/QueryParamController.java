package com.akshita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryParamController {

	//the variable inside @Request Param is the key, in url it should be like ?naam=Rohit , key in queryparam and this should match
	@GetMapping("/user-info")
	public String getSomeData(@RequestParam("naam")String n, Model model) {
		model.addAttribute("name", n); //this "name" is used to access the data in it in model object on jsp page, as we were doing earlier
		return "userInfoPage";
	}
	
	//we can pass multiple query parameters
	@GetMapping("/user-info2")
	public String getSomeData2(@RequestParam("naam")String n, @RequestParam("cor")String c, Model model) {
		model.addAttribute("name", n);
		model.addAttribute("course", c);
		return "userInfoPage2";
	}
	
	//if you do not specify the @RequestParam var then the key passed in url should match the var name i.e. "c" here
	@GetMapping("/user-info3")
	public String getSomeData3(@RequestParam("naam")String n, String c, Model model) {
		model.addAttribute("name", n);
		model.addAttribute("course", c);
		return "userInfoPage3";
	}

	
}
