package com.test.customer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.customer.model.Customer;

@Service
public class CustomerService implements ICustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer createCustomer(Customer customer) {
		customer = customerRepository.save(customer);
		return customer;
	}

	@Override
	public Optional<Customer> findByCustomerId(int customerId) {
		Optional<Customer> customer = customerRepository.findById(customerId);
		return customer;
	}

}
