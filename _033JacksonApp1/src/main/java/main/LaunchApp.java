package main;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Artist;

//Demo of Java Obj to JSON using Jackson API
public class LaunchApp {
	
	//it is a normal java application
	
	public static void main(String[] args) throws JsonProcessingException{
		Artist artist1 = new Artist (1, "Akshita", "Delhi");
		System.out.println(artist1);
		
		ObjectMapper mapper = new ObjectMapper(); 
		String jsonString=mapper.writeValueAsString(artist1); //java obj is being written as string i.e. json only
		System.out.println(jsonString); //printing in console to check wheter it converted properly from java obj to JSON
		//NOTE - it will give serialization error if you don't have getters and setters in model class
	
		
		//CONVERTING JAVA LIST INTO JSON
		Artist a2 = new Artist(2, "Aadhya", "Meerut");
		Artist a3 = new Artist(3, "Bhuvan", "Pune");
		Artist a4 = new Artist(4, "Payal", "Aligarh");
		List<Artist> artists = Arrays.asList(artist1, a2, a3, a4);
		
		String jsonArtists = mapper.writeValueAsString(artists);
		System.out.println(jsonArtists);
		
		//use below for pretty-printing
		String jsonArtistPretty = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(artists);
		System.out.println(jsonArtistPretty);
		
	
	}

}
