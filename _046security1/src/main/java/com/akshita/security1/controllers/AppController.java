package com.akshita.security1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AppController {
	
	//since we are using spring security, we can not access any endpoints directly
	//as soon as a user hit any of these endpoints, instead of getting the data, they will see a login page
	//this login page is coming itself from spring securiy, we didn't wrote it anywhere, being done by pre-defined classes in spring security module
	
	//now when we run this application, you will see in console a generated password
	//this password and username = user can be used to access the application
	//now we can specify the username and password in .properties file, but then this would be only for one user, only one credentials, one one else can access this application
	
	//once you have given the password and logged in, you access that endpoint or anyohter endpoint which is not restricted without logging in again
	//this is because a session is established i.e. it is statefull application as of now, we may change that behaviour
	//session id is stored in client's browser cookies, 
	//second time when req is made, it checks if its for the same session, if yes, it allow it to access data as the user has already been authenticated
	//but this opens a door for malecious website to reach the server with the same session ids
	//so by default spring security allows only to do read operations and CSRF is implemtned for post, put, patch and delete req
	
	@GetMapping("/app-info")
	public ResponseEntity<String> getInfo(HttpServletRequest request){
		String resp= "This is the information. and session id is : " + request.getSession().getId();
		return ResponseEntity.ok(resp);
	}
	
	@GetMapping("/app-info-users")
	public ResponseEntity<String> getUsersInfo(HttpServletRequest request){
		String resp= "This app has 1000 active users and Session id is : " + request.getSession().getId();
		return ResponseEntity.ok(resp);
	}
	
	//FYI- you will find that session id would be same when hitting any of these end points
	//b/c an HTTP session is associated with a client (browser) and application, not with an individual controller method.
	//The session ID remains the same across requests as long as the same session is maintained. 
	//It can change if the session expires, is invalidated, or the session ID is rotated (for example, during authentication).
}
