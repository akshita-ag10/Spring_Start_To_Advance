package main;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Artist;
import java.io.File;
import java.io.IOException;
import java.util.List;
//Demo of Java Obj to JSON using Jackson API
public class LaunchApp {
	
	//it is a normal java application
	
	
	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		Artist[] artists = mapper.readValue(new File("json/sample.json"), Artist[].class);
		for(Artist a : artists) {
			System.out.println(a);
		}
		
		//if the json data contains any key value pair that does not exist in our Artist class
		//like for eg. the json file data has aCountry=India, but we don't have this property in Artist class
		//so this will result in error.
		//to avoid this error when end user passes some extra data, use @JsonIgnoreProperties at the Artist class
	
		//to do the same in springboot application , i.e. to ignore the extra parameters provided by user, 
		//see _032REstAPIApp2
	
	}	
	

}
