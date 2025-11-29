package com.akshita.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.akshita.service.IGreetings;
//@RestController = @Controller + @ResponseBody
//@ResponseBody annotation specify that this method has the capability of accepting JSON or XML data and has the capability of producing JSON or XML data
//so, @RestController annotation specify that this class methods have the capability of accepting and generation JSON or XML data


//@Controller 
@RestController
public class GreetingsController{
	
	@Autowired
	private IGreetings service;

	@GetMapping("/greet")
//	@ResponseBody //to get response on browser either add this annotaiton on every method or just add @RestController on class instead of @Controller
	public String greet() {
		String response = service.getWish("Akshita");
		return response;
	}
	//the above method would work as expected but it is not a good way
	//the response object i.e. String here, should not be sent directly to client, it should be kept in ResponseEntity obj and then sent along with the Status
	//see below
	
	@GetMapping("/greet2")
//	@ResponseBody
	public ResponseEntity<String> greet2(){
		String resp = service.getWish("Ishita");
		return new ResponseEntity<String>(resp, HttpStatus.OK);		
	}
	
}
