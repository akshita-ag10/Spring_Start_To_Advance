package com.akshita.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.akshita.model.Tourist;

@Service
public interface ITouristService {
	
	public Tourist fetchTouristById(Integer id);
	public List<Tourist> fetchAllTourist();	
	public String registerTourist(Tourist t);
	public String updateTouristInfo(Tourist t);
	public String updateTouristBudget(Integer id, Double budget);
	public String deleteTouristById(Integer id);

}
