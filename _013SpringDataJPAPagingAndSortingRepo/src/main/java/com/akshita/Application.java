package com.akshita;

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
		
		Iterable<Bike> sortedBikes = service.fetchBikeInfoBySorting(false, "modelName");
		sortedBikes.forEach(sb -> System.out.println(sb));
		System.out.println("**************************************************");
		
		service.fetchBikesInPagesStatic(1, 2).forEach(p->System.out.println(p));
		service.fetchBikesInPagesDynamic(4);
	}

}
