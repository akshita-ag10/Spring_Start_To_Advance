package com.akshita.springProfiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshita.springProfiles.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{
	
	
}
