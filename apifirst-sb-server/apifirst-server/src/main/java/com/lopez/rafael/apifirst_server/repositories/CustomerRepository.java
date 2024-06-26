package com.lopez.rafael.apifirst_server.repositories;

import guru.springframework.apifirst.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CustomerRepository extends CrudRepository<Customer, UUID> {
}
