package com.akshita.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akshita.entity.Customer;
import com.akshita.repo.Repository;

@Service
public class CustService implements IService{
	
	@Autowired
	Repository repo ;

	@Override
	public List<Customer> getCustInfo() {
		return repo.findAll();
	}
	
	@Override
	public Customer searchById(int id) {
		Optional<Customer> op = repo.findById(id);
		Customer c = null;
		if(op.isPresent()) {
			c = op.get();
		}
		return c;
	}

	@Override
	public Customer addCustomer(String fname, String lname, String city) {
		Customer c = new Customer(fname, lname, city);
		return repo.save(c);
		
	}

	@Override
	public Customer updateCustomer(Customer c) {
		Optional<Customer> op = repo.findById(c.getCid());
		
		if(op.isPresent()) {
			Customer cust = op.get();
			cust.setFname(c.getFname());
			cust.setLname(c.getLname());
			cust.setCity(c.getCity());
			return repo.save(cust);
		}
		return new Customer("n/a", "n/a", "n/a");
		
				
	}

	@Override
	public void deleteCustomer(int id) {
		repo.deleteById(id);
		
	}

	

}
