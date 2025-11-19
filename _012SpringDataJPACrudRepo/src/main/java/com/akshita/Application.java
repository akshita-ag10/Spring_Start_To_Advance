package com.akshita;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.akshita.model.Bike;
import com.akshita.service.BikeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Application.class, args);
		BikeService service = container.getBean(BikeService.class);
		
		Bike b1 = new Bike("Jawa", "42 Bobber", "334cc", 210000.00);
		System.out.println("one bike as been registered : " + service.registerBike(b1));
		
		Bike b2 = new Bike("Yezdi", "Roadster", "334cc", 205000.00);
		Bike b3 = new Bike("Honda", "CB350", "348cc", 215000.00);
		Bike b4 = new Bike("Royal Enfield", "Classic 350", "349cc", 205000.00);
		Bike b5 = new Bike("Royal Enfield", "Hunter 350", "349cc", 170000.00);
		Bike b6 = new Bike("Royal Enfield", "Meteor 350", "349cc", 220000.00);
		Iterable<Bike> bikes = Arrays.asList(b2, b3, b4, b5, b6);		
		service.registerAllBikes(bikes).forEach(b -> System.out.println(b));
		System.out.println("Multiple bikes have been registered");
		
		Long count = service.getBikeCount();
		System.out.println("Total bikes present into the system are : " + count);
		
		Integer id=2;
		Boolean available = service.checkAvailable(id);
		System.out.println("Availability of Bike with id " + id + " is : " + available);
		
		System.out.println("Fetching bike with id 8");
		Optional<Bike> b = service.fetchBikeById(8);
		System.out.println(b);
		System.out.println(service.fetchBikeById2(8)); 
		
		System.out.println("Fetching bikes with ids 2,3,4");
		Iterable<Integer> ids = Arrays.asList(2,3,4);
		Iterable<Bike> bs = service.fetchMultipleBikesByIds(ids);
		bs.forEach(bi->System.out.println(bi));
		
		System.out.println("Fetching all Bikes");
		Iterable<Bike> bss = service.fetchAllBikes();
		bss.forEach(bi -> System.out.println(bi));
		
		
		//DELETE operations
		System.out.println(service.removeById(10));	
		
//		System.out.println(service.removeByObj(new Bike("Royal Enfield", "Hunter 350", "349cc", 170000.0)));
		//gives error b/c in constructor we are not passing id, and to delete, it is matching the record with id
		
		Bike mybike = new Bike();
		mybike.setId(9);
		mybike.setBrand("Royal Enfield");
		mybike.setModelName("myModel");
		mybike.setEngine("650cc");
		mybike.setPrice(280000.0);
		System.out.println(service.removeByObj(mybike));
		
		List<Integer> ids2 = Arrays.asList(7,8,9);
		System.out.println(service.removeByIds(ids2));
		
//		System.out.println(service.removeAll());
		
		
		
		
		
		
	
	
	}

}
