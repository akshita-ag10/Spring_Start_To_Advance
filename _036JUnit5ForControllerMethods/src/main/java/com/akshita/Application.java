package com.akshita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//junit5 and Junit Jupiter is same
//Junit5 is not Junit4 + extra features
//Junit5 is a new architecture, it is like a completely  new API they have developed

//when we studied normal JUnit5, we were writing testcases for normal methods that we were invoking
//now we are learning to write unit test cases for controller methods that are invoked on a particular API call

//what is mocking
//like if we are writing unit test for a particular method and that method internally calls some another method
//now if this internal method gives wrong output the test of our method can fail
//to avoid this situation we mock the behaviour of internal method called, so that it gives fixed o/p and we can write our test case based on that for our method

//for java, there are different libraries for mocking , like - mockito, powerMock frameworks
//default unit testing framework in spring boot - JUnit5 (we need not to put it's dependency separately, it gets automatically included in springboot project)
//default mocking framework in spring boot is - mockito 

//if you want to use any other unit testing framework or mocking framework - add it's dependency separately and use it.

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
