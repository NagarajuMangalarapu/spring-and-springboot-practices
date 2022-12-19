package com.spring.repository;

import com.spring.studententites.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRep extends JpaRepository<Student,Integer>{
 
	
}
