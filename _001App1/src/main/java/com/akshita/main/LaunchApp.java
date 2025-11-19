package com.akshita.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.akshita.service.Coaching;
import com.akshita.service.DevOpsCourse;
import com.akshita.service.JavaCourse;

public class LaunchApp {
    public static void main(String[] args) {

    	//2 ways to get IOC container
    	//ApplicationContext(eager initialization) - note: spring boot uses this only 
    			//whether we are using the beans created by IOC conatainer or not using them in our code, ApplicationContext container will create them for us
    	//BeanFactory (lazy initialization)
    			//It will act like it have created the beans but will actually create them when we are using those bean
        
    	ApplicationContext container = new ClassPathXmlApplicationContext("applicationConfig.xml");	
    	Coaching ch = container.getBean(Coaching.class);
        boolean status = ch.buyTheCourse(8000.00);

        if(status)
            System.out.println("successfully purchased");
        else
            System.out.println("failed to purchase the course, try again");
    
       //IS THERE A WAY TO ACHIEVE LAZY LOADING VIA APPLICATION CONTEXT
        //There is a concept of scopes in spring boot
        //4 imp scopes are there - singleton, prototype, request, sessions
        
    
    }
}
