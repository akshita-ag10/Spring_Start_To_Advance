package com.akshita.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.akshita.model.Bike;

@Repository
public interface IBikeRepo extends PagingAndSortingRepository<Bike,Integer> {

}
