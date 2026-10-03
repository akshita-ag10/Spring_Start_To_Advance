package com.akshita.AuthenticateDBUsers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akshita.AuthenticateDBUsers.model.Learner;
import com.akshita.AuthenticateDBUsers.repository.LearnerRepo;

@Service
public class LearnerService {
	@Autowired
	LearnerRepo repo;
	
	public Learner addLearner(Learner l) {
		return repo.save(l);
	}
	
	public List<Learner> getLearners(){
		return repo.findAll();
	}
	
	public Learner getLearnerByUsername(String username) {
		return repo.findByUsername(username);
	}

}
