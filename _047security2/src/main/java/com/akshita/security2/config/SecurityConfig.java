package com.akshita.security2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;



//here in this cofig class we are trying to change the inbuilt behaviour of spring security, 
//b/c we want customized one

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	//accessing the pre-defined inbuilt beans
	//need to customize the code written in SecurityFilterChange if we want to change the default behaviour
	
	
	//pre-defined classes would look new to us, but it's b/c we are looking at them for first time
	//also security set up is done once for applicaiton not a daily work
	
	
	//BEFORE IMPLEMENTION SECURITY IN YOUR APP
	//10 owasp is official org that releases top 10 security threats every few years
	//before implementing security in your application, you should be aware of all these threats atleast
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		//since we are making the application stateless, CSRF won't happen as session id won't be maintained
		//so let's disable CSRF
		http.csrf(customizer -> customizer.disable()); //lambda expression, cutomizer obj would be passed internally we need not to make it
		http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)); //session is just a var name//everything is predefined
		http.authorizeHttpRequests(request -> request.anyRequest().authenticated()); 
		http.httpBasic(Customizer.withDefaults());//with this it allows to access this application with any rest client like postman
		
		return http.build();
	}
	
	
	//UserDetailsService is an interface, it represents the users of our application
	//we need to implement this interface in order to allow authentication for all users of our application
	
	@Bean
	public UserDetailsService userDetailsService() {
		
		//here we are hardcoding the users, later we will learn to fetch it from db
		UserDetails user= User.withUsername("Jaggu")
				.password("{noop}Welcome123") //since we are not using password encoder, we need to write {noop}, {noop} tells Spring Security: "This password is not encoded; compare it as plain text."
				.roles("USER")
				.build();
		
		UserDetails admin = User.withUsername("Akku")
				.password("{noop}Admin@123")
				.roles("ADMIN")
				.build();
		
		//we will add all these users in a pre-defined class
		return new InMemoryUserDetailsManager(user,admin);
	}
	
	
	//for authentication of users in db - see next project - _048AuthenticateDBUsers
	
	
}
