package com.akshita.utils;

import java.util.UUID;

public class IdGenerator {
	
	//In util classes, we write methods as 'static' , so that they can be accessed by class name
	
	public static String generateID() {
//		return UUID.randomUUID().toString(); //if you want to modify the id according to some standard/requirement
		return UUID.randomUUID().toString().replace("-", "").substring(0, 12);
		
	}

}
