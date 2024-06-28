package com.lopez.rafael.apifirst_server.controllers;

import com.lopez.rafael.apifirst_server.repositories.CustomerRepository;
import com.lopez.rafael.apifirst_server.repositories.OrderRepository;
import com.lopez.rafael.apifirst_server.repositories.ProductRepository;
import guru.springframework.apifirst.model.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class BaseTest {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    WebApplicationContext wac;

    public MockMvc mockMvc;

    Customer testCustomer;

    @BeforeEach
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac)
                .build();
        this.testCustomer = customerRepository.findAll().iterator().next();
    }

}
