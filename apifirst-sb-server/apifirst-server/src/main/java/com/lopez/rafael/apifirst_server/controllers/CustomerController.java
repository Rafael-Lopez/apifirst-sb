package com.lopez.rafael.apifirst_server.controllers;

import com.lopez.rafael.apifirst_server.services.CustomerService;
import guru.springframework.apifirst.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.lopez.rafael.apifirst_server.controllers.CustomerController.BASE_URL;

@RequiredArgsConstructor
@RestController
@RequestMapping(BASE_URL)
public class CustomerController {

    public static final String BASE_URL = "/v1/customers";
    private final CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customer>> listCustomers() {
        return ResponseEntity.ok(customerService.listCustomers());
    }
}
