package com.akshita.SpringAOP.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.akshita.SpringAOP.model.Artist;
import com.akshita.SpringAOP.service.ArtistService;

@RestController
public class ArtistController {
	
	@Autowired
	ArtistService aServ;
	
	@GetMapping("/get-artists")
	public ResponseEntity<List<Artist>> getArtists(){
		List<Artist> list = aServ.fetchAllArtists();
		return new ResponseEntity<List<Artist>>(list,HttpStatus.OK);
	}
	
	@PostMapping("/add-artist")
	public ResponseEntity<Artist> addArtist(Artist a){
		Artist artist = aServ.registerArtist(a);
		return new ResponseEntity<Artist>(artist,HttpStatus.CREATED);
	}

}
