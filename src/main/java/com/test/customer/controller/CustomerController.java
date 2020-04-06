package com.test.customer.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.customer.model.Customer;
import com.test.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("createCustomer")
	public Customer createCustomer(@RequestBody Customer customer) {
		customer.setFullname();
		customer.setAge();
		Customer customerResponse = customerService.createCustomer(customer);
		return customerResponse;
	}
	
	@GetMapping(value = "/{customerId}")
	public Optional<Customer> getCustomerDetails(@PathVariable int customerId) {
		Optional<Customer> customerResponse = customerService.findByCustomerId(customerId);
		return customerResponse;
	}
}
