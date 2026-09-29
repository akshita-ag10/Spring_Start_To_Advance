package com.akshita.SpringAOP.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akshita.SpringAOP.model.Artist;

@Repository
public interface ArtistRepo extends JpaRepository<Artist, Integer>{

}
