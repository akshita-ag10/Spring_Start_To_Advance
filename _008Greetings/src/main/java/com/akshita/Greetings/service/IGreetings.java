package com.akshita.Greetings.service;

import org.springframework.stereotype.Service;

@Service
public interface IGreetings {
	String getGreetings(String name);
}
