package com.springrest.Coustomer.Controller;

import java.util.List;
import com.springrest.Customer.entities.Customer;
import com.springrest.CustomerService.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerservice;
	
	public CustomerController(CustomerService customerservice)
	{
		this.customerservice = customerservice;
	}
	
	@GetMapping("/customer")
	public List<Customer> getCustomers()
	{
		return this.customerservice.getCustmors();
	}
	
	@GetMapping("/customer/{customerId}")
	public Customer getCustomer(@PathVariable int cId) {
		return this.customerservice.getCustomer(cId);
	  }
	
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		return this.customerservice.updateCustomer(customer);
	}
	
	
	@DeleteMapping("/customer/{customerId}")
	public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable String cId)
	{
		try {
			this.customerservice.deleteCustomer(Integer.parseInt(cId));
		return new ResponseEntity<>(HttpStatus.OK);
 		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
