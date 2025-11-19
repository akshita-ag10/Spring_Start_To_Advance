package com.akshita.service;

import java.util.List;

import com.akshita.model.Bike;
import com.akshita.view.ResultView;

public interface IBikeService {
	List<ResultView>fetchByPriceLessThan(Integer p);
}
