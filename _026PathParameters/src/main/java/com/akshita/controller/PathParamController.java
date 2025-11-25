package com.akshita.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathParamController {
	//for query param and path param -> Get mapping is used
	//query parameters are at the end of the url being send
	//unlike that, path parameter can be anywhere in the url
	
	//http://localhost:8080/user-info/Akshita
	@GetMapping("/user-info1/{naam}")
	public String getSomeData(@PathVariable("naam")String name,Model model) {
		model.addAttribute("name", name);
		return "userInfoPage";
	}
	
	//http://localhost:8080/user-info2/Akshita/Reasoning
	@GetMapping("/user-info2/{naam}/{cor}")
	public String getSomeData2(@PathVariable("naam")String name, @PathVariable("cor")String c, Map<String, String> map) {
		map.put("name", name);
		map.put("course", c);
		return "userInfoPage2";
	}
	
	//http://localhost:8080/user-info3/Akshita/Reasoning
	@GetMapping("/user-info3/{naam}/{c}")
	public String getSomeData3(@PathVariable("naam") String name, @PathVariable String c, Map<String, String> map) {
		map.put("name", name);
		map.put("course", c);
		return "userInfoPage3";
	}
}
