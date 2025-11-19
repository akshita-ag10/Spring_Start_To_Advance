package com.akshita.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.akshita.model.Bike;

public interface IBikeRepo extends JpaRepository<Bike, Integer> {
	
}
