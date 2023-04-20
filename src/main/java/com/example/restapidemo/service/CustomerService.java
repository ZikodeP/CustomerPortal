package com.example.restapidemo.service;

import com.example.restapidemo.domain.Customer;

import java.util.List;

public interface CustomerService {
     Customer findCustomerById(Long id);
     List<Customer> findAllCustomers();
     Customer saveCustomer(Customer customer);
     Customer updateCustomer(Customer customer);
     void deleteCustomer(Long id);
}
