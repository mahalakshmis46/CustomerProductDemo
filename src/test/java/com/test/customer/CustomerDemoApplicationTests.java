package com.test.customer;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import com.test.customer.controller.CustomerController;
@AutoConfigureMockMvc
@SpringBootTest
@RunWith(SpringRunner.class)
class CustomerControllerUnitTest {

	MockMvc mockMvc;
	
	CustomerController customerController;
	
	String createCustomerJson = "";
	String getCustomerJson = "";
	
	public void testCreateCustomer() throws Exception {
		

this.mockMvc.perform( MockMvcRequestBuilders
		  .post("customer/createCustomer")
    .content(createCustomerJson)
    .contentType(MediaType.APPLICATION_JSON)
    .accept(MediaType.APPLICATION_JSON))
    .andExpect(status().is2xxSuccessful())
    .andDo(MockMvcResultHandlers.print());
	}
	public void testGetCustomerDetails() {}
	
}
