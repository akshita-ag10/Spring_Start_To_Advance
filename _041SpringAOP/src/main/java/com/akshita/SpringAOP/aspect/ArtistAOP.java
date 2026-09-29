package com.akshita.SpringAOP.aspect;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ArtistAOP {
	
	//in the pointcut we specify the methods of target on which aspect should be applied
	//joinpoint becomes the exact point where aspect is applied during runtime
	
	//by @Before or @After we are telling whether we want the below annotated method to be executed just before or after the aspect applied method
	
	@Before(value="execution(* com.akshita.SpringAOP.controllers.*.*(..))")
	public void beforeAdviseController(JoinPoint jp) {
		//here we can have anything in the body and argument
		//the thing is that this aspect method (beforeAdviseController) would be executed exact before the calls to methods specified above in point cut
		//and the joinpiont would be the point where the aspect would integrate with business logic ( the methods specified above in pointcut expression) at runtime
		
		System.out.println("Request made to " + jp + " at " + LocalDateTime.now());
	}
	
	//EXPLANATION OF POINTCUT EXPRESSION
	//first * -> says any return type, we can write any specific return type also , like int, depending on for which methods we want the aspect to be applied
	//com.akshita.SpringAOP.* -> says all package in SpringAOP, we can specify also, see above pointcut expression
	//com.akshita.SpringAOP.*.* -> all classes , we can specify also
	//com.akshita.SpringAOP.*.*.* -> all methods, we can specify also
	//com.akshita.SpringAOP.*.*.*(..) -> method taking any no. of arguments, we can specify also
	
	@After(value="execution(* com.akshita.SpringAOP.*.*.*(..))")
	public void afterAdviceHehe(JoinPoint jp) {
		System.out.println("Request made to " + jp + " at " + LocalDateTime.now());
	}
	

	/*Around Advice
	Runs before and after the target method
	Wraps the target method execution.
	You can execute logic before and after the method, control whether it runs, and access its return value.
	proceed() is used to invoke the target method.
	If proceed() throws an exception, the code after it won't execute unless you handle the exception with try-catch or finally.
	*/
	
	
	/*@Around("execution(* com.akshita.SpringAOP.*.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {

	    System.out.println("Before method execution");

	    Object result = pjp.proceed();

	    System.out.println("After method execution");

	    return result;
	}
	*/
	
	/*@AfterThrowing(
		    pointcut = "execution(* com.akshita.SpringAOP.*.*(..))",
		    throwing = "ex"
		)
		public void throwAdvice(Exception ex) {
		    System.out.println("Exception occurred: " + ex.getMessage());
		}
	*/
	
	/*
	 * A practical example
	 * Suppose you have a TouristService method that registers a tourist.
	 * Before: Log "Starting tourist registration".
	 * After: Log "Registration method completed", regardless of success or exception.
	 * Around: Measure how long registration takes, invoke the method with proceed(), and log its result.
	 * After Throwing: Log the exception if registration fails.
	 * */
	
	/*
	 * Important interview point
	 * @After is not the same as @AfterReturning.
	 * @After runs after the method exits, whether normally or exceptionally.
	 * @AfterReturning runs only when the method completes successfully.
	 * @AfterThrowing runs only when the method throws an exception.
	 * @Around provides the most control over the method invocation.*/
	
	
	
	
}
