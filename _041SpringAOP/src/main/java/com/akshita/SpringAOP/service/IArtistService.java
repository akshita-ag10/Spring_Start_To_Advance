package com.akshita.SpringAOP.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.akshita.SpringAOP.model.Artist;

@Service
public interface IArtistService {

	List<Artist> fetchAllArtists();
	Artist registerArtist(Artist a);
}
