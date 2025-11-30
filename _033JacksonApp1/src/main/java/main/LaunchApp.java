package main;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Artist;

//Demo - Java obj to Json
public class LaunchApp {
	
	public static void main(String[] args) throws JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		Artist a =  new Artist(1,"Akshita", "Pune");
		
		String jsonString = mapper.writeValueAsString(a);
		System.out.println(jsonString);
		//just printing in console to see that it coverts java obj to json
		
		Artist a2 = new Artist(2, "Aadhya", "Meerut");
		Artist a3 = new Artist(3, "Megha", "Shillong");
		Artist a4 = new Artist(4, "Priyansh", "Dehli");
		List<Artist> artists = Arrays.asList(a, a2, a3, a4);
		//converting list of java obj to json
		String json = mapper.writeValueAsString(artists);
		System.out.println(json);
		
		//for pretty printing
		String jsonPretty = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(artists);
		System.out.println(jsonPretty);
	}

}
