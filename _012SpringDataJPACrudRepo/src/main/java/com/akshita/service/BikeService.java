package com.akshita.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.akshita.Dao.IBikeRepo;
import com.akshita.model.Bike;

@Service
public class BikeService implements IBikeService{

	@Autowired
	IBikeRepo repo ;

	@Override
	public Bike registerBike(Bike bike) {
		return repo.save(bike);
	}

	@Override
	public Iterable<Bike> registerAllBikes(Iterable<Bike> bikes) {
		return repo.saveAll(bikes);
	}

	@Override
	public Long getBikeCount() {
		return repo.count();
	}

	@Override
	public Boolean checkAvailable(Integer id) {
		return repo.existsById(id);
	}

	@Override
	public Optional<Bike> fetchBikeById(Integer id) {
		return repo.findById(id);
	}
	
	//another way to find 1 bike by id, if you don't want Optional as return type
	@Override
	public Bike fetchBikeById2(Integer id) {
		Optional<Bike> op = repo.findById(id);
		if(op.isPresent()) {
			return op.get();			
		}
		System.out.println("Bike is not found");
		return null;
	}

	@Override
	public Iterable<Bike> fetchMultipleBikesByIds(Iterable<Integer> ids) {
		return repo.findAllById(ids);
	}

	@Override
	public Iterable<Bike> fetchAllBikes() {
		return repo.findAll();
	}

	
	//since return type of delete methods is void, we will write some logic to ensure wheter bike(s) is/are deleted or not
	@Override
	public String removeById(Integer id) {
		//way1
		boolean status = repo.existsById(id);
		if(status) {
			repo.deleteById(id);
			return "Bike has been deleted with id " + id;
		}
		return "Bike does not exist in database with id " + id;
		
		
		//way2
//		Optional<Bike> b = repo.findById(id);
//		if(b.isPresent()) {
//			repo.deleteById(id);
//			return "Bike has been deleted with id " + id;			
//		}
//		return "Bike does not exist in database";
		
	}
	
	@Override
	public String removeByObj(Bike b) {
		Integer bId = b.getId();
		boolean status = repo.existsById(bId);
		
		if(status) {
			repo.delete(b);
			return "Bike has been deleted from Database";
		}
		return "Bike does not exist in database";
	}

	@Override
	public String removeByIds(List<Integer> ids) {
		//here there can we any of the 2 requirements (cases)
		List<Bike> bikes = (List<Bike>) repo.findAllById(ids);
		
		//case 1 - delete the bikes if all ids exists in the database
//		if(bikes.size() == ids.size()) {
//			repo.deleteAllById(ids);
//			return "Bikes have been deleted with ids : " + ids.toString();
//		}
//		return "All bikes with ids: " + ids.toString() + " do not exist in database, hence not deleting any bike";
		
		
		//case 2 - even if all the ids does not exist in database, delete the one which are present in database
		if(bikes.size() > 0) {
			repo.deleteAllById(ids);
			return "Whichever bike existed in database has been deleted from the ids : " + ids.toString();
		}	
		return "None of the bike exist in database from the ids : " + ids.toString();
	
	}

	@Override
	public String removeAll() {
		long count = repo.count();
		if(count>0.0) {
			repo.deleteAll();
			return "all bikes have been deleted from Database";
		}
		return "no bikes exist in database";
	}

	
	
	
	
}
