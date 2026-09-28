package com.akshita.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.akshita.service.Impl.TouristService;
import com.akshita.model.*;
import java.util.*;


//this controller is working as expected but this is SHITTY CODING
//V BAD
//why - b/c controller's work is to only take the req pass it to service layer, get reponse and give resp to client
//but here we are doing exception handling in controller - v bad
//but in controller we are calling service methods and they can generate exception, so we need to handle
//issue - Modularity needs to be maintained, we need to write clean code

//so we have AOP for this
//here comes in picture - SEPARATION OF CONCERNS
//we create advice layer, when ever exception come in service layer method, it autmatically goes to advice layer  and is handled in advice layer
//(we don't make call to advice layer exception handling methods, it is redirected to advice layer automatically when exception occurs) 
//and response after handling the exception goes from advice layer to dispatcher servlet (skipping the controller)
//so we call service layer method, 
//if everything is fine, response come from service to controller and then goes to dispatcher servlet, which passes it client
//if exception occurs in service layer method, it automatically goes to advice layer where it is handled and response is given to dispatcher servlet directly
//the class in advice layer that handles need to annotated with @RestControllerAdvice so that is acts as an alternate of controller when exception occurs

//so now see _038TouristAppAPI for this, we would be actually using this app for backend api calls
//b/c _037 has shitty coding.

@RestController
public class TouristController {

	@Autowired
	TouristService service;
	
	@GetMapping("/get-tourist/{id}")
	public ResponseEntity<?> getTouristById(@PathVariable("id") int id){
		try {
			Tourist t = service.fetchTouristById(id);
			return new ResponseEntity<Tourist>(t,HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/get-tourists")
	public ResponseEntity<List<Tourist>> getTourists() {
		List<Tourist> tourists = service.fetchAllTourist();
		return new ResponseEntity<List<Tourist>> (tourists, HttpStatus.OK);
	}
	
	@PostMapping("/reg-tourist")
	public ResponseEntity<String> registerTourist(@RequestBody Tourist t){
		String resp = service.registerTourist(t);
		return new ResponseEntity<String>(resp, HttpStatus.CREATED);
	}
	
	@PutMapping("/update-tourist")
	public ResponseEntity<?> updateTourist(@RequestBody Tourist t){
		try {
			String resp = service.updateTouristInfo(t);
			return new ResponseEntity<String>(resp, HttpStatus.OK);
			
		}catch(Exception e){
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@PatchMapping("/udpate-tourist-budget/{id}/{newBudget}")
	public ResponseEntity<String> updateTouristBudget(@PathVariable("id") Integer id, 
			@PathVariable("newBudget") Double nBudget){
		
		try {
			String resp=service.updateTouristBudget(id, nBudget);
			return new ResponseEntity<String>(resp, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/delete-tourist/{id}")
	public ResponseEntity<String> deleteTourist(@PathVariable("id") Integer id){
		try {
			String resp = service.deleteTouristById(id);
			return new ResponseEntity<String>(resp,HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
}
