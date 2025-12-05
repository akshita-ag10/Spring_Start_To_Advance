package com.akshita.web;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.akshita.model.Student;
import com.akshita.service.IStudentService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(StudentController.class) //we need to write this annotation here, b/c here we are not writing unit test cases for normal methods, here we are writing testcases for methods that would be invoked
public class StudentControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
//	@Autowired //since we are using mock object of service, we need to inject mock obj of service not original
	@MockBean
	private IStudentService studentService;

	//writing 'public' keyword is optional in testcases method from Junit5 onward
	@Test
	//@Disabled // since we already tested this, we can disable it to test other units separately in the same test file
	public void testGetStudent() throws Exception {
		
		//MOCK OBJECT ----
		//since getStudent() method of controller is internally calling service.fetchStudent()
		//we do not want our test to fail if this internal method is not working properly
		//so here in test we mock the behaviour of internally caller methods
		//this is only known as mocking
		Mockito.when(studentService.fetchStudent()).thenReturn(new Student(2, "Akshita", "Delhi", 15));
		
		//REQUEST OBJECT--- 
		//so since these are controller methods and they would be invoked when req is made to particular endpoints (/get-student)
		//so for testing we are creating the fake request
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/get-student");
		ResultActions res = mockMvc.perform(requestBuilder); //we are saying create req obj for the specified end point
		MvcResult result = res.andReturn();//after the req is made, we are collecting the result here
		
		
		//taking response from result
		MockHttpServletResponse response = result.getResponse();
		//since the return type of this method is ResponseEntity we will get that only in response
		//'response' contains response body and headers etc. i.e. metadata
				
		
		//now we need to collect what we want
		int status = response.getStatus();
		System.out.println(status);
		//we can collect other part also from the response or whole response together - for this there are diff methods
		
		
		//now testing actual v/s expected		
		Assertions.assertEquals(200, status);
	}
	
	
	
	//TESTING FOR POST METHOD
	@Test
	public void testAddStudent() throws Exception {
		
		//MOCK OBJECT
		Mockito.when(studentService.saveStudent(ArgumentMatchers.any())).thenReturn(true); //it says return 'true' when ever req is made to saveStudent method with any argument
		
		//JSON DATA
		Student s= new Student (1, "Dolly", "Agra", 27);
		ObjectMapper mapper = new ObjectMapper();//we need to convert the java obj to json and pass it to req builder
		String json = mapper.writeValueAsString(s);
		
		
		//REQUEST OBJECT THAT ACCEPTS JSON DATA 
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/register-student")
							.contentType(MediaType.APPLICATION_JSON)
							.content(json);
		
		ResultActions res = mockMvc.perform(requestBuilder);
		MvcResult result = res.andReturn();
		MockHttpServletResponse response = result.getResponse();
		int status = response.getStatus();
		
		//assertion 
		Assertions.assertEquals(201, status);
	
	
	}

	
}
