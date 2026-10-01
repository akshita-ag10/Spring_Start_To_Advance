package com.akshita.backendStudentApp.service;

import org.springframework.stereotype.Service;

import com.akshita.backendStudentApp.entity.Student;

import java.util.*;

@Service
public interface IStudentService {
	
	List<Student> getAllStudents();
	Student saveStudent(Student s);
	Student getStudentById(Long id);
	Student updateStudent(Long id, Student student);
	void deleteStudentById(Long id);
	

}
