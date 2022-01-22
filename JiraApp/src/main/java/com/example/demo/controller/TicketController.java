package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Ticket;
import com.example.demo.repo.TicketRepo;

@Controller
public class TicketController {

	@Autowired
	TicketRepo tp;

	@RequestMapping("/create")
	public String showTicketCreationPage() {
		return "jiraTicket";
	}

	@RequestMapping("/saveTicket")
	public void saveTicket(@ModelAttribute Ticket ticket) {
		ticket.setIssueType("New issue");
		tp.save(ticket);
	}
}
