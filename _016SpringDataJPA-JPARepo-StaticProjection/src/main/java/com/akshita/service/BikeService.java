package com.akshita.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.akshita.dao.IBikeRepo;
import com.akshita.model.Bike;
import com.akshita.view.ResultView;

@Service
public class BikeService implements IBikeService {
	@Autowired
	IBikeRepo repo;

	@Override
	public List<ResultView> fetchByPriceLessThan(Integer p) {
		return repo.findByPriceLessThan(p);
	}

	

}
