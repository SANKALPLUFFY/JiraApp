package com.learn.springweb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.learn.springweb.Repository.ProductRepository;
import com.learn.springweb.entity.Product;

@RestController
public class ProductController {
	@Autowired
	ProductRepository repo;

	@RequestMapping(value = "/products/", method = RequestMethod.GET)
	public List<Product> getProducts() {
		return repo.findAll();
	}

	@RequestMapping(value = "/product/{id}",method = RequestMethod.GET)
	public Product getProduct(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}

	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute Product product , BindingResult result, Model model) {
		 repo.save(product);
		 ModelAndView mv = new ModelAndView("createproduct");
		 Product product1 = new Product();
		 mv.addObject(product1);
		// return "createproduct";
		return mv;
	}
	
	@RequestMapping(value = "/createProduct")
	public ModelAndView createProduct(@ModelAttribute Product product , BindingResult result, Model model) {
		 repo.save(product);
		 ModelAndView mv = new ModelAndView("createproduct");
		 Product product1 = new Product();
		 mv.addObject(product1);
		// return "createproduct";
		return mv;
	}

	@RequestMapping(value="/update/",method=RequestMethod.PUT)
	public Product updateProduct(@ModelAttribute Product product, BindingResult result)
	{
		return repo.save(product);
		
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public ModelAndView deleteProduct(@PathVariable("id") int id)
	{
		Product product1 = new Product();
		Optional<Product> ls = repo.findById(id);
		repo.deleteById(id);
		 ModelAndView mv = new ModelAndView("delete");
		 
		 mv.addObject("removed",product1);
		 
		 return mv;
	}
}
