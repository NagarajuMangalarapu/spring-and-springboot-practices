package com.spring.service;

import java.util.List;

import com.spring.repository.StudentRep;
import com.spring.studententites.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService{

	@Autowired
	private StudentRep studentrep;
	
	public List<Student> getCustmors() {
		// TODO Auto-generated method stub
		return studentrep.findAll();
	}

	
	public Student getCustomer(int sId) {
		// TODO Auto-generated method stub
		return studentrep.getById(sId);
	
	}
	public Student addCustomer(Student customer) {
		studentrep.save(customer);
		return customer;
	}

	public Student updateCustomer(Student customer) {
	studentrep.save(customer);
		return customer ;
	}

	public void deleteCustomer(int sId) {
		Student entity = studentrep.getById(sId);
		studentrep.delete(entity);
}
}
