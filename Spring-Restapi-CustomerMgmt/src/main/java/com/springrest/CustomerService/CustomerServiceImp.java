package com.springrest.CustomerService;

import java.util.List;

import com.springrest.Customer.Repository.CustomerRep;
import com.springrest.Customer.entities.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImp implements CustomerService {
    
	@Autowired
	private CustomerRep customerrep;
	
//	public CustomerServiceImp(CustomerRep customerrep)
//	{
//		this.customerrep = customerrep;
//		
//	}
	
	@Override
	public List<Customer> getCustmors() {
		// TODO Auto-generated method stub
		return customerrep.findAll();
	}

	
	@Override
	public Customer getCustomer(int cId) {
		// TODO Auto-generated method stub
		return customerrep.getById(cId);
	
	}
	@Override
	public Customer addCustomer(Customer customer) {
		customerrep.save(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
	customerrep.save(customer);
		return customer ;
	}

	@Override
	public void deleteCustomer(int cId) {
		Customer entity = customerrep.getById(cId);
		customerrep.delete(entity);
	}

}
