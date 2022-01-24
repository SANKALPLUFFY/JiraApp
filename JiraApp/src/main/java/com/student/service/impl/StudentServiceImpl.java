package com.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.learn.jpa.entity.Student;
import com.learn.jpa.repository.StudentRepository;
import com.student.service.StudentService;

public class StudentServiceImpl implements StudentService {

	
	@Autowired
	StudentRepository repo;
	
	@Override
	@Transactional
	public void delete(Student student) 
	{
		repo.delete(student);
		repo.save(new Student());
	}

}
