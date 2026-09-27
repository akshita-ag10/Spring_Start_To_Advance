package com.akshita.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.akshita.entity.Customer;
import com.akshita.service.CustService;

import jakarta.annotation.PostConstruct;

@Controller
public class CustomerController {
	
	@Autowired
	CustService cService;
	
	@GetMapping("/customers")
	public String getCustomers(Model m) {
		List<Customer> clist = cService.getCustInfo();
		m.addAttribute("customers", clist);
		return "cust-info";
	}
	
	@GetMapping("/customers/add")
	public String addCustomer(@ModelAttribute("customer") Customer c) {
		return "addCustomer";
	}
	
	@PostMapping("/customers/add")
	public String addCustomer(Model m, @ModelAttribute("customer") Customer c) {
		Customer cust = cService.addCustomer(c.getFname(), c.getLname(), c.getCity());
		m.addAttribute("customer", cust);
		return "addedCustomer";
	}
	
	@GetMapping("/customers/update/{id}")
	public String updateCust(@PathVariable("id") int id, Model m) {
		Customer cust = cService.searchById(id);
		m.addAttribute("customer", cust);
		
		return "updateCustForm";
	}
	
	@PostMapping("/customers/update")
	public String updateCust(@ModelAttribute("customer") Customer c, Model m) {

	    System.out.println("ID received: " + c.getCid());
	    System.out.println("Fname received: " + c.getFname());
	    System.out.println("Lname received: " + c.getLname());
	    System.out.println("City received: " + c.getCity());
		
		Customer cust = cService.updateCustomer(c);
		m.addAttribute("customer", cust);
		return "updatedCust";
	}
	
	@DeleteMapping("/customers/delete/{id}")
	public String deleteCustomer(@PathVariable("id") int id) {
		cService.deleteCustomer(id);
		return "redirect:/customers";
	}
	
	@PostConstruct
	public void test() {
		System.out.println("customer controller loaded");
	}

}
