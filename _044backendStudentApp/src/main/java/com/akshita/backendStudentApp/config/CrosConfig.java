package com.akshita.backendStudentApp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;


@Configuration
public class CrosConfig implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedOrigins("http://localhost:5173") //can specify multiple origins also here
		.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
		.allowedHeaders("*") //would be used in spring security
		.allowCredentials(true); //would be used in spring security
		
		//if want to allow origin patterns
//		registry.addMapping("/**")
//        .allowedOriginPatterns(
//            "http://localhost:*",
//            "https://*.myapp.com"
//        )
//        .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE")
//        .allowedHeaders("*");
		
		
		//can write both origins and originPatterns in one go
		
//		registry.addMapping("/**")
//        .allowedOrigins("http://localhost:3000")
//        .allowedOriginPatterns(
//            "http://localhost:*",
//            "https://*.myapp.com"
//        )
//        .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE")
//        .allowedHeaders("*");
	}
}
