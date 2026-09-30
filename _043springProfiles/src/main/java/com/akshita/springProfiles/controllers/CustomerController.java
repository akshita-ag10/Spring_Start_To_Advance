package com.akshita.springProfiles.controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akshita.springProfiles.service.ICustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	ICustomerService service;

	@GetMapping("/buying")
	public ResponseEntity<String> buying(){		
		boolean res = service.customerBought(55.5);
		String resp;
		if(res) {
			resp = "Product bought... :)";
		}else {
			resp = "Product didn't sold... :(";
		}		
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}
	

}
