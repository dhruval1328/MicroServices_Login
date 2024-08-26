package com.data.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.model.Student;
import com.data.repository.StudentRepo;
import com.data.serviceI.StudentI;

@Service
public class StudentImpl implements StudentI{

	@Autowired
	StudentRepo sr;
	

	@Override
	public List<Student> getlog(String p, String pass) {

		if(p.equals("Admin")&&pass.equals("123")) {
			List<Student> l = sr.findAll();
			return l;
		}
		else {
			List<Student> l1 = sr.getByPnameAndPassword(p, pass);
		return l1;
		}
	}

}
