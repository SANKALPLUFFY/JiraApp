package com.learn.jpa;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.learn.jpa.entity.Student;
import com.learn.jpa.repository.StudentRepository;

@SpringBootTest
class SpringJpaApplicationTests {
	
	@Autowired
	StudentRepository repo;

	@Test
	void contextLoads() 
	{
		Student stud = new Student();
		stud.setId(1);
		stud.setName("Sankalp");
		stud.setMarks(10);
		repo.save(stud);
		
		List<Student> studentDetails= repo.findAll();
		
		System.out.println(repo.findAll().get(0).getId());
		
		//Student savedStudent =repo.findById(1).get();
	}

}
