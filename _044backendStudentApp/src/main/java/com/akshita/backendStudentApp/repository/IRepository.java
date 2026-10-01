package com.akshita.backendStudentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.akshita.backendStudentApp.entity.*;

public interface IRepository extends JpaRepository<Student, Long> {

}
