package com.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	List<Student> getByPnameAndPassword(String pname, String password);
}
