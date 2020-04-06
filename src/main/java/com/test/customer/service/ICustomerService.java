package com.test.customer.service;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.test.customer.model.Customer;

@Component
public interface ICustomerService {
public Customer createCustomer(Customer customer);
public Optional<Customer> findByCustomerId(int CustomerId);
}
