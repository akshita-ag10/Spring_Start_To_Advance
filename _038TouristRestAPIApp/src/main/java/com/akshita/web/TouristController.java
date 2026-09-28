package com.akshita.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.akshita.service.Impl.TouristService;
import com.akshita.model.*;
import java.util.*;


@RestController
@RequestMapping("/tourists")
public class TouristController {

	@Autowired
	TouristService service;
	
	@GetMapping("/get-tourist/{id}")
	public ResponseEntity<Tourist> getTouristById(@PathVariable("id") int id){
		Tourist t = service.fetchTouristById(id);
		return new ResponseEntity<Tourist>(t,HttpStatus.OK);
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
		String resp = service.updateTouristInfo(t);
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}
	
	@PatchMapping("/udpate-tourist-budget/{id}/{newBudget}")
	public ResponseEntity<String> updateTouristBudget(@PathVariable("id") Integer id, 
			@PathVariable("newBudget") Double nBudget){
		
		String resp=service.updateTouristBudget(id, nBudget);
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete-tourist/{id}")
	public ResponseEntity<String> deleteTourist(@PathVariable("id") Integer id){
		String resp = service.deleteTouristById(id);
		return new ResponseEntity<String>(resp,HttpStatus.OK);
	}
}
