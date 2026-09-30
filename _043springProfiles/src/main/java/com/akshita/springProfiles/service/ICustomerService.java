package com.akshita.springProfiles.service;

import org.springframework.stereotype.Service;

@Service
public interface ICustomerService {

	boolean customerBought(double amount);
}
