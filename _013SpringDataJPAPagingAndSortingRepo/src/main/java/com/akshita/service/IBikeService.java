package com.akshita.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.akshita.model.Bike;

@Service
public interface IBikeService {
	
	Iterable<Bike> fetchBikeInfoBySorting(boolean isAsc, String... properties);

	Iterable<Bike> fetchBikesInPagesStatic(int pageNum, int pageSize);
	//here, in static one, it just display single page that is the one according to page number
	
	void fetchBikesInPagesDynamic(int pageSize);
	//if you want all the pages
}
