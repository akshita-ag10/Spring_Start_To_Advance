package com.akshita.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.akshita.service.Impl.TouristService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import com.akshita.model.*;
import java.util.*;


@RestController
@RequestMapping("/tourists")
@Tag(name="TouristInfoAPIs", description="APIs to register tourist and get tourist info")
public class TouristController {

	@Autowired
	TouristService service;
	
	@Operation(summary="Get Tourist Info", description="Accpets tourist's id and returns tourist data in json format")
	@GetMapping("/get-tourist/{id}")
	public ResponseEntity<Tourist> getTouristById(@PathVariable("id") int id){
		Tourist t = service.fetchTouristById(id);
		return new ResponseEntity<Tourist>(t,HttpStatus.OK);
	}
	
	@Operation(summary="Get All Tourists Info", description="Returns all Tourists Data in Json format")
	@GetMapping("/get-tourists")
	public ResponseEntity<List<Tourist>> getTourists() {
		List<Tourist> tourists = service.fetchAllTourist();
		return new ResponseEntity<List<Tourist>> (tourists, HttpStatus.OK);
	}
	
	@Operation(summary="Create Tourist", description="Accpets Tourist details in json format and returns the generated tourist's id")
	@PostMapping("/reg-tourist")
	public ResponseEntity<String> registerTourist(@RequestBody Tourist t){
		String resp = service.registerTourist(t);
		return new ResponseEntity<String>(resp, HttpStatus.CREATED);
	}
	
	@Operation(summary="Update Tourist", description="Accpets Tourist details to update in json format and returns status of update")
	@PutMapping("/update-tourist")
	public ResponseEntity<?> updateTourist(@RequestBody Tourist t){
		String resp = service.updateTouristInfo(t);
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}
	
	@Operation(summary="Update Tourist Budget", description="Accpets Tourist id and new Budget to update and returns status of update")
	@PatchMapping("/udpate-tourist-budget/{id}/{newBudget}")
	public ResponseEntity<String> updateTouristBudget(@PathVariable("id") Integer id, 
			@PathVariable("newBudget") Double nBudget){
		
		String resp=service.updateTouristBudget(id, nBudget);
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}
	
	
	@Operation(summary="Delete Tourist", description="Accpets Tourist id to update and returns status of deletion")
	@DeleteMapping("/delete-tourist/{id}")
	public ResponseEntity<String> deleteTourist(@PathVariable("id") Integer id){
		String resp = service.deleteTouristById(id);
		return new ResponseEntity<String>(resp,HttpStatus.OK);
	}
}
