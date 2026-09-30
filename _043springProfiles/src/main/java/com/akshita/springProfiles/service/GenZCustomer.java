package com.akshita.springProfiles.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("genz")
public class GenZCustomer implements ICustomerService {
	
	public GenZCustomer() {
		super();
		System.out.println("GenZCustomer bean created");
	}

	@Override
	public boolean customerBought(double amount) {
		// TODO Auto-generated method stub
		return true;
	}

}
