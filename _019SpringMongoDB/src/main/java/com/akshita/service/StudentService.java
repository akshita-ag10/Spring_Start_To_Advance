package com.akshita.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import com.akshita.dto.StudentDTO;
import com.akshita.model.Student;
import com.akshita.repo.IStudentRepo;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private IStudentRepo repo;
	
	@Override
	public String registerStudentInfo(StudentDTO dto) {
		
		Student stu = new Student();
//		stu.setCity(dto.getCity());// if we do like this, it will be lot of code
									// instead we can use below way
		BeanUtils.copyProperties(dto, stu); //BeanUtils is a class spring framework
		Student sDoc = repo.save(stu);
		
		return "StudentInfo stored with id " + sDoc.getId();
	}

	@Override
	public List<Student> findAllStudents() {
		return repo.findAll();
	}

	@Override
	public String removeDocument(String id) {
		Optional<Student> op = repo.findById(id);
		if(op.isEmpty()) {
			return "The record does not exist in db";
		}
		repo.deleteById(id);
		return "The record has been deleted";
	}

}
