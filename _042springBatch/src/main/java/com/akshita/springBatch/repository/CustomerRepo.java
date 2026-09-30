package com.akshita.springBatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.akshita.springBatch.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{
	
	
}
