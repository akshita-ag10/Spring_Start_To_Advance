package com.akshita.service;

import org.springframework.stereotype.Service;

import com.akshita.model.Student;

@Service
public interface IStudentService {
	
	Student fetchStudent();
	boolean saveStudent(Student s);

}
