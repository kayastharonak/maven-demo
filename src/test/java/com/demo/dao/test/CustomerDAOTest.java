package com.demo.dao.test;

import com.demo.dao.CustomerDAO;
import com.demo.dao.impl.CustomerDAOImpl;
import com.demo.dto.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CustomerDAOTest {

	private CustomerDAO customerDAO;

	private Customer customer;

	@BeforeEach
	void beforeEach() {
		customerDAO = new CustomerDAOImpl();
		customer = new Customer();
		customer.setFirstName("Ronak");
		customer.setId("1");
		customer.setLastName("Kayastha");
	}

	@Test
	void testAddCustomer() {
		customerDAO.addCustomer(customer);
		assertTrue(customerDAO.getAll().size() > 0);
	}

}
