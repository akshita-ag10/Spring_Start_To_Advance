package com.akshita.Dao;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.akshita.model.Bike;

public interface IBikeRepo extends CrudRepository<Bike, Integer> {

}
