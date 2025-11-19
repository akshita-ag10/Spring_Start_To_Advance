package com.akshita;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.akshita.service.BikeService;
import com.akshita.view.ResultView1;
import com.akshita.view.ResultView2;
import com.akshita.view.ResultView3;
import com.akshita.view.View;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Application.class, args);
		BikeService service = container.getBean(BikeService.class);
		
		List<ResultView1> rv1 = service.findByPriceLessThan(210000, ResultView1.class);
		rv1.forEach(rv -> System.out.println(rv.getId() + " : " + rv.getPrice()));
		
		service.findByPriceLessThan(210000, ResultView2.class).forEach(rv->System.out.println(rv.getBrand() + ", " + rv.getModelName() + " : " + rv.getPrice()));;
	
		service.findByPriceLessThan(210000, ResultView3.class).forEach(rv->System.out.println(rv.getBrand() + " - " + rv.getModelName() + " - " + rv.getEngine()));;
	
		//NOTE - if you see the sql queries in the output in console
		//you will see that, from db only it is fetching the limitted columns data, according to the result view specified
	}

}
