package com.akshita.AuthenticateDBUsers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.akshita.AuthenticateDBUsers.model.Learner;
import com.akshita.AuthenticateDBUsers.service.LearnerService;

@RestController
@RequestMapping("/learners")
public class LearnerController {
	
	@Autowired
	LearnerService lServ;
	
	@PostMapping("/learner")
	public ResponseEntity<Learner> addLearner(Learner l) {
		Learner learner =  lServ.addLearner(l);
		return new ResponseEntity<Learner>(learner,HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Learner>> getLearners(){
		List<Learner> list = lServ.getLearners();
		return new ResponseEntity<List<Learner>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/{username}")
	public ResponseEntity<Learner> getLearnerByUsername(@PathVariable("username") String un){
		Learner ln = lServ.getLearnerByUsername(un);
		return new ResponseEntity<Learner>(ln,HttpStatus.OK);
	}

}
