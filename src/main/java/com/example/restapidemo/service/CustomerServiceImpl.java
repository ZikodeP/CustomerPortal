package com.example.restapidemo.service;

import com.example.restapidemo.domain.Customer;
import com.example.restapidemo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).get();
    }
    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }
    @Override
    public Customer saveCustomer( Customer customer){
        return customerRepository.save(customer);
    }
    @Override
    public Customer updateCustomer(Customer customer) {
        try {
            Customer _customer = customerRepository.findById(customer.getId()).get();
            if(_customer != null){
                customerRepository.save(customer);
            }
            return customer;
        }
        catch(IllegalArgumentException e){
            throw new IllegalArgumentException();
        }

    }
    @Override
    public void deleteCustomer(Long id) {
        try {
            Customer _customer = customerRepository.findById(id).get();
            if(_customer != null){
                customerRepository.delete(_customer);
            }
        }
        catch(IllegalArgumentException e){
            throw new IllegalArgumentException();
        }
    }
}
