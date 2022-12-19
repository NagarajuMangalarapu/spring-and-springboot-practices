package com.springrest.CustomerService;

import java.util.List;

import com.springrest.Customer.entities.Customer;

public interface CustomerService {

	public List<Customer> getCustmors();
	
	public Customer getCustomer(int cId);
	
	public Customer addCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer);
	
	public void deleteCustomer(int cId);
	
	
}
