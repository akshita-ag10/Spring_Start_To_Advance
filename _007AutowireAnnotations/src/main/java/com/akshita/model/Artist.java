package com.akshita.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//target class
@Service
public class Artist {
	//3 levels for autowiring - field level autowiring, setter level autowiring, and, constructor level autowiring
	//by default, in spring, autowiring is byType, if more than 1 bean is of this Type then you have 2 options
		//either specify one of the depandent class as @Primary or use @Qualifier annotation
		//@Qualifier annotation has more preference than @Primary annotation

//	@Autowired //filed level autowiring
//	@Qualifier("waterColors")
	IColors col ;
	
//	@Autowired  //setter level autowiring
//	@Qualifier("waterColors")
	public void setCol(IColors color) {
		System.out.println("Setter injection");
		this.col = color;
	}
	
	public Artist() {
		System.out.println("Artist bean created");
	}
	
	@Autowired
//	@Qualifier("waterColors") //@Qualifier annotation is in-aligible at constructor injection
	//if you will open and see the code of Qualifier annotation, we will find that it can be done at field, method, parameter, type and annotation type
	//so for constructor, go with parameter
	public Artist(@Qualifier("acrylicColors")IColors color) {
		System.out.println("Artist bean created via paramertized consturctor");
		System.out.println("Constructor Injection");
		this.col = color;
	}
	
	public boolean chooseColors() {
		return col.paint();
		
	}
	

}
