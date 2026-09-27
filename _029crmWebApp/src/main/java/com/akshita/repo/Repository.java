package com.akshita.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.akshita.entity.Customer;

public interface Repository extends JpaRepository<Customer,Integer>{

}
