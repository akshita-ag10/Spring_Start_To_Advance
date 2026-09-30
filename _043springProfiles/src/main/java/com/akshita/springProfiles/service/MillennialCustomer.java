package com.akshita.springProfiles.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("millennial")
public class MillennialCustomer implements ICustomerService {
	
	public MillennialCustomer() {
		super();
		System.out.println("MillennialCustomer bean created");
	}

	@Override
	public boolean customerBought(double amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
