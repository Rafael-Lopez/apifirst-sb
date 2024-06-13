package com.lopez.rafael.apifirst_server.repositories;

import guru.springframework.apifirst.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductRepository extends CrudRepository<Product, UUID> {
}
