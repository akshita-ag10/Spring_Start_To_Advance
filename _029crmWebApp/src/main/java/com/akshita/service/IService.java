package com.akshita.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.akshita.entity.Customer;

@Service
public interface IService {
	
	List<Customer> getCustInfo();
	Customer searchById(int id);
	Customer addCustomer(String fname, String lname, String city);
	Customer updateCustomer(Customer c);
	void deleteCustomer(int id);

}
