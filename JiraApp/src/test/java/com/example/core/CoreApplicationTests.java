package com.example.core;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Scope;

import static org.junit.jupiter.api.Assertions.*;
import com.example.core.services.Sum;

@SpringBootTest
class CoreApplicationTests {

	@Autowired
	Sum service;
	
	@Autowired
	Sum service1;
	
	@Test
	void contextLoads() 
	{
		assertNotNull(service);
		System.out.println(service.sumOfNumbers(5, 10));
		
		System.out.println(service);
		System.out.println(service1);
	}

}
