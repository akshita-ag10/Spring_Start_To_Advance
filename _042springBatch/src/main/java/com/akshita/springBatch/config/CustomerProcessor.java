package com.akshita.springBatch.config;

import org.springframework.batch.infrastructure.item.ItemProcessor;

import com.akshita.springBatch.model.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer>{
//<Customer, Customer> => means take customer type data and give customer type data
	
	@Override
	public Customer process(Customer item) throws Exception {
		//write processing or filtering logic here
		return item;
	}
	

}
