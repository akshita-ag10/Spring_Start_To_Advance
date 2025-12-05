package com.akshita.service;

import org.springframework.stereotype.Service;

import com.akshita.model.Student;

@Service
public class StudentService implements IStudentService {

	@Override
	public Student fetchStudent() {
		Student s = new Student(2, "Akshita", "Delhi", 15);
		return s;
	}

	@Override
	public boolean saveStudent(Student s) {
		System.out.println(s);
		return true;
	}

	
	

}
