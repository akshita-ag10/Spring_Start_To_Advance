package com.akshita.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.akshita.model.Bike;
import com.akshita.view.View;

public interface IBikeRepo extends JpaRepository<Bike, Integer> {

	//now previously, it was static, it was fetching 2 columns and that was fixed, it will fetch 2 columns only every time
	//this time we want it to be dynamic, so we will create diff result views 
	//diff result view will be fetching diff set of columns
	//so when the user want to fetch some columns, the result view that has those columns getters will be called
	
	<T extends View> List<T> findByPriceLessThan(Integer p, Class<T> cls); 
	//now here, since T could be any Type that is extending View type
	//so we are taking one more parameter of class Type, so when this method is called from main method,
	//it know what is the exact return type from all the classes/interfaces that extends View
	//basically , while invoking this method, we will specify that in which result view we want our result to be
	
}
