package com.demo.dao;

import com.demo.dto.Customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CustomerDAO {

    Map<String, Customer> customerRegistry = new HashMap<>();

    public void addCustomer(Customer customer);

    public void updateCustomer(Customer customer);

    public void deleteCustomer(String id);

    public void getCustomerById(String id);

    public List<Customer> getAll();


}
