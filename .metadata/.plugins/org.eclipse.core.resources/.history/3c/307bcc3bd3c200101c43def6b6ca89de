package com.akshita.service;

import java.util.List;

import com.akshita.model.Bike;

public interface IBikeService {
	
	List<Bike> fetchByPrice(Integer p); 
	List<Bike> fetchByPriceIs(Integer p); 
	List<Bike> fetchByPriceEquals(Integer p);
	
	List<Bike> fetchByPriceLessThan(Integer pl);
	List<Bike> fetchByPriceBetween(Integer minP, Integer maxP);
	List<Bike> fetchByBrandEquals(String brand);
	List<Bike> fetchByBrandInAndPriceBetween(List<String> brands, Integer minP, Integer maxP);

}
