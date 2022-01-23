package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Ticket;
import com.example.demo.repo.TickRepo;

@Controller
public class TicketController {

	@Autowired
	TickRepo tp;

	@RequestMapping("/create")
	public ModelAndView showTicketCreationPage() {
		ModelAndView mv = new ModelAndView("jiraTicket");
		Ticket ticket = new Ticket();
		mv.addObject(ticket);
		return mv;
	}

	 @RequestMapping(value ="/saveTicket",method = RequestMethod.POST)
	    public ModelAndView addTicket(@ModelAttribute Ticket ticket, BindingResult result, Model model) {
	       
	        ticket.toString();
	        tp.save(ticket);
	        ModelAndView mv = new ModelAndView("jiraTicket");
			Ticket ticket1 = new Ticket();
			mv.addObject(ticket1);
	        return mv;
	    }
	 
	 @RequestMapping(value ="/show",method = RequestMethod.GET)
	    public ModelAndView viewTicket(@ModelAttribute Ticket ticket, BindingResult result, Model model) {
	      
		 ModelAndView mv = new ModelAndView("viewTickets");
		 List<Ticket> findAll = tp.findAll();
		 
		 findAll.get(1).getId();
		 
			mv.addObject("ticket",findAll);
	       
	        return mv;
	    }
	 
	 
	 @RequestMapping(value ="/delete/{id}",method = RequestMethod.GET)
	    public void deleteTicket(@PathVariable("id") int id) {
	      
		 tp.deleteById(id);
		 
	    }
	 

	
}
