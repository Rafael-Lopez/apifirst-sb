package com.lopez.rafael.apifirst_server.repositories;

import guru.springframework.apifirst.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<Order, UUID> {
}
