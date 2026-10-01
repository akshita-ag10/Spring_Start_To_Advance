package com.akshita.backendStudentApp.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.akshita.backendStudentApp.entity.Student;
import com.akshita.backendStudentApp.repository.IRepository;

@Service
public class StudentService implements IStudentService {
	
	@Autowired
	IRepository repo;

	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	@Override
	public Student saveStudent(Student s) {
		return repo.save(s);
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(()-> new NoSuchElementException("Student not found with id " + id));
	}

	@Override
	public Student updateStudent(Long id, Student s) {
		
		Optional<Student> op = repo.findById(id);
		if(op.isPresent()) {
			Student stu = op.get();
			stu.setAddress(s.getAddress());
			stu.setClassName(s.getClassName());
			stu.setEmail(s.getEmail());
			stu.setFathersName(s.getFathersName());
			stu.setName(s.getName());
			stu.setPhoneNumber(s.getPhoneNumber());
			return repo.save(stu);
		}else {
			throw new NoSuchElementException("Student not found");
		}
		
	}

	@Override
	public void deleteStudentById(Long id) {
		repo.deleteById(id);
		
	}

}
