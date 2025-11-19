package com.akshita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import com.akshita.dao.IBikeRepo;
import com.akshita.model.Bike;

@Service
public class BikeService implements IBikeService {

	IBikeRepo repo;

	@Autowired
	public void setRepo(IBikeRepo repo) {
		this.repo = repo;
	}

	@Override
	public Iterable<Bike> fetchBikeInfoBySorting(boolean isAsc, String... properties){
		
		Sort sort = Sort.by(isAsc?Direction.ASC:Direction.DESC, properties);		
		return repo.findAll(sort);
	}

	@Override
	public Iterable<Bike> fetchBikesInPagesStatic(int pageNum, int pageSize) {

		Pageable pa = PageRequest.of(pageNum, pageSize);
		//if you want paging and sorting both together use this and take 'isAsc' and 'properties' also in the method arguments
//		Sort sort = Sort.by(isAsc?Direction.ASC:Direction.DESC, properties);		
//		PageRequest.of(pageNum, pageSize, sort);
		Page<Bike> pages= repo.findAll(pa);
	
		return pages.getContent();
	}

	@Override
	public void fetchBikesInPagesDynamic(int pageSize) {
		
		//here we are hard coding the dbCount variable, correct way is to implement crudRepository also and use it's count() method- repo.count();
		int dbCount = 6;
		int pageCount = dbCount%pageSize == 0? dbCount/pageSize : dbCount/pageSize +1;
		
		for(int i = 0 ; i<pageCount; i++) {
			System.out.println("-------------------------- PAGE " + i + " -----------------------------");
			Pageable pageable = PageRequest.of(i, pageSize);
			Page<Bike> page = repo.findAll(pageable);
			page.getContent().forEach(b -> System.out.println(b));
		}
		
		//if you want the data to come in sorted form as well, use 
		
	}
	
	
	
	
	
}
