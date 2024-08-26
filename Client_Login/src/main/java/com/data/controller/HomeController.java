package com.data.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.model.Student;
import com.data.serviceI.StudentI;

@RestController
public class HomeController {

	@Autowired
	StudentI si;
	
	@GetMapping("/log/{pname}/{password}")
	public List getdata(@PathVariable("pname")String p,@PathVariable("password")String pass) {
		
		
		List<Student> l = si.getlog(p,pass);
		return l;
	}
}
