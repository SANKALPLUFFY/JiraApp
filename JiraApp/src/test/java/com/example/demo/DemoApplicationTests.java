package com.example.demo;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Ticket;
import com.example.demo.repo.TickRepo;


//@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	TickRepo tp;
	
	@Test
	void indexDB() {
		Ticket t = new Ticket();
		t.setAsignee("rohan");
		t.setDescription("tes");
		t.setIssue("tete");
		t.setSummary("rer");
		t.setReporter("fdff");
		
		System.out.println(t);
		Ticket save = tp.save(t);
		System.out.println(save);
	}

}
