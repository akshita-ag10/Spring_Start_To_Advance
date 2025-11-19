package com.akshita.service;

import java.util.List;
import java.util.Optional;

import com.akshita.model.Bike;

public interface IBikeService {

	//to save 1 bike
	Bike registerBike(Bike b);
	
	//to save multiple bikes	
	Iterable<Bike> registerAllBikes(Iterable<Bike> bikes);
	
	//method to get count of how many records are there in the database  => repo.count();
	Long getBikeCount();
	
	//check by id, if paritcular bike is there in database
	Boolean checkAvailable(Integer id);
	
	//find bike by id
	Optional<Bike> fetchBikeById(Integer id);
	//way 2 for 'find bike by id' if you don't want Optional to be the return type
	Bike fetchBikeById2(Integer id);
	
	//find multiple bikes by ids
	Iterable<Bike> fetchMultipleBikesByIds(Iterable<Integer> ids);
	
	//find all bikes
	Iterable<Bike> fetchAllBikes();
	
	//delete bike by id
	String removeById(Integer id);
	
	//delete bike by object
	String removeByObj(Bike b);
	
	//delete multiple bikes by ids
	String removeByIds(List<Integer> ids);
	
	//delete all bikes
	String removeAll();
}
