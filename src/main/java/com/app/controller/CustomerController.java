package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.CustomerDao;
import com.app.model.Customer;

@RestController
public class CustomerController {

	@Autowired
	private CustomerDao dao;

	 @RequestMapping("/")
		public String homePahge() {
			
			return "Welcome to Cusomer Home Page";
		}
	 
	  @GetMapping("/cust/{id}")
	  
	  public Optional<Customer> getCust(@PathVariable("id")int id) {
	  
	  
	  return dao.findById(id);
	  
	  }
	  
	  @RequestMapping(path = "/ListCust" , produces= {"application/json"} )
	  
	  @ResponseBody public List<Customer> getAllCust() {
	  
	  
	  return (List<Customer>) dao.findAll(); }
	 
	
	// Restcontroller using at class level + post/getmappings
	
	@PostMapping(path="/saveCust")
	public Customer saveCust(@RequestBody Customer cust) {
		
		dao.save(cust);
		return cust;
	}
	@PostMapping("/List")
	public List<Customer> getAllCustomer(){
		return (List<Customer>) dao.findAll();
	}
	@DeleteMapping(path="cust/{id}")
	public String delCust(@PathVariable("id")int id) {
		
		dao.deleteById(id);
		return "delete successfully: "+id;
	}
	
	@PutMapping(path="/updateCust",consumes= {"application/json"})
	public Customer saveOrUpdateCust(@RequestBody Customer cust) {
		
		dao.save(cust);
		return cust;
	}
}
