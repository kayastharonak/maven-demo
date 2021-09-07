package com.demo.dao.impl;

import com.demo.dao.CustomerDAO;
import com.demo.dto.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public void addCustomer(Customer customer) {
        customerRegistry.put(customer.getId(), customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRegistry.put(customer.getId(), customer);
    }

    @Override
    public void deleteCustomer(String id) {
        customerRegistry.remove(id);
    }

    @Override
    public void getCustomerById(String id) {
        customerRegistry.get(id);
    }

    @Override
    public List<Customer> getAll() {
        return new ArrayList<>(customerRegistry.values());
    }
}
