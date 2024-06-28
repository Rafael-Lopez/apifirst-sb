package com.lopez.rafael.apifirst_server.controllers;

import com.lopez.rafael.apifirst_server.repositories.CustomerRepository;
import com.lopez.rafael.apifirst_server.repositories.OrderRepository;
import com.lopez.rafael.apifirst_server.repositories.ProductRepository;
import guru.springframework.apifirst.model.Customer;
import guru.springframework.apifirst.model.Order;
import guru.springframework.apifirst.model.Product;
import jakarta.servlet.Filter;
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
    @Autowired
    Filter validationFilter;

    public MockMvc mockMvc;

    Customer testCustomer;
    Product testProduct;
    Order testOrder;

    @BeforeEach
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac)
                .addFilter(validationFilter)
                .build();
        this.testCustomer = customerRepository.findAll().iterator().next();
        this.testProduct = productRepository.findAll().iterator().next();
        this.testOrder = orderRepository.findAll().iterator().next();
    }

}
