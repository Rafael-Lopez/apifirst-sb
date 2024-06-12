package com.lopez.rafael.apifirst_server.services;

import com.lopez.rafael.apifirst_server.repositories.CustomerRepository;
import guru.springframework.apifirst.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> listCustomers() {
        return StreamSupport.stream(customerRepository.findAll().spliterator(), false).toList();
    }
}
