package com.springrest.Customer.Repository;

import com.springrest.Customer.entities.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRep extends JpaRepository<Customer, Integer>
{
	

}
