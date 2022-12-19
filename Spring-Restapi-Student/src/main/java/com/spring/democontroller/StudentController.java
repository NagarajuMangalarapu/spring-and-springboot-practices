package com.spring.democontroller;

import java.util.List;

import com.spring.service.StudentService;
import com.spring.studententites.Student;
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
public class StudentController {
	@Autowired
	private StudentService service;
	
	@GetMapping("/hello")
	public String test()
	{
		return "yaa Hoo";
	}
	@GetMapping("/showcustomers")
	public List<Student> getCustomers()
	{
		return this.service.getCustmors();
	}
	
	@GetMapping("/customer/{customerId}")
	public Student getCustomer(@PathVariable String sId) {
		return this.service.getCustomer(Integer.parseInt(sId));
		
	}
	
	@PutMapping("/addcustomer")
	public Student updateCustomer(@RequestBody Student customer)
	{
		return this.service.updateCustomer(customer);
	}
	
	
	@DeleteMapping("/customer/{customerId}")
	public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable String sId)
	{
		try {
			this.service.deleteCustomer(Integer.parseInt(sId));
		return new ResponseEntity<>(HttpStatus.OK);
 		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	

}
