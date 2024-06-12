package com.lopez.rafael.apifirst_server.services;

import guru.springframework.apifirst.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> listCustomers();
}
