package com.example.restful.service;

import com.example.restful.domain.Customer;
import com.example.restful.repositories.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.getOne(id);
    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerRepository.findAll();
    }
}
