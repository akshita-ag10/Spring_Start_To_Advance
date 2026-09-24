package com.akshita.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akshita.exceptions.TouristNotFoundException;
import com.akshita.model.Tourist;
import com.akshita.repo.ITouristRepo;
import com.akshita.service.ITouristService;

@Service
public class TouristService implements ITouristService{
	
	
	private ITouristRepo repo;	
	@Autowired
	public void setRepo(ITouristRepo repository) {
		repo = repository;
	}


	@Override
	public Tourist fetchTouristById(Integer id) {		
//		Optional<Tourist> tourist = repo.findById(id);
//		if(tourist.isPresent()) {
//			return tourist.get();
//		}else throw new TouristNotFoundException("Tourist not found with id: " + id);
		
		return repo.findById(id).orElseThrow(() -> new TouristNotFoundException("Tourist not found with id: " + id));
	}

	@Override
	public List<Tourist> fetchAllTourist() {
		List<Tourist> allTourists = repo.findAll();
		return allTourists;
	}

	@Override
	public String registerTourist(Tourist t) {
		Tourist tourist = repo.save(t);
		return "Tourist has been registered with id: " + tourist.getId();
	}


	@Override
	public String updateTouristInfo(Tourist t) {
		Optional<Tourist> op = repo.findById(t.getId());
		if(op.isPresent()) {
			Tourist tourist = repo.save(t);
			return "Tourist info has been updated";
		}	
		throw new TouristNotFoundException("Tourist not found with given information.");
		
	}

	@Override
	public String updateTouristBudget(Integer id, Double budget) {
		Optional<Tourist> op = repo.findById(id);
		if(op.isPresent()) {
			Tourist tourist =op.get();
			tourist.setBudget(budget);
			repo.save(tourist);
			return "Tourist budget has been updated";
		}
		throw new TouristNotFoundException("Tourist not found with id: " + id);		
	}
	

	@Override
	public String deleteTouristById(Integer id) {
		Optional<Tourist> opTourist = repo.findById(id);
		if(opTourist.isPresent()) {
			repo.deleteById(id);
			return "Tourist is deleted with id:" + id;
		}
		throw new TouristNotFoundException("Tourist not found with id: " + id);
	}

}
