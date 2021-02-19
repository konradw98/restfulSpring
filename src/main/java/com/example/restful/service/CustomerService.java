package com.example.restful.service;

import com.example.restful.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);

    List<Customer>  findAllCustomer();

}
