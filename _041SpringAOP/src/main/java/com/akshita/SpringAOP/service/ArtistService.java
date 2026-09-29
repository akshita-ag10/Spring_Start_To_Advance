package com.akshita.SpringAOP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akshita.SpringAOP.model.Artist;
import com.akshita.SpringAOP.repo.ArtistRepo;

@Service
public class ArtistService implements IArtistService {

	@Autowired
	ArtistRepo repo;
	
	@Override
	public List<Artist> fetchAllArtists() {
		List<Artist> list = repo.findAll();
		return list;
	}

	@Override
	public Artist registerArtist(Artist a) {
		Artist artist = repo.save(a);
		return artist;
	}

}
