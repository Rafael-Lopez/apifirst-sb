package com.lopez.rafael.apifirst_server.services;

import guru.springframework.apifirst.model.Order;

import java.util.List;
import java.util.UUID;


public interface OrderService {
    List<Order> listOrders();
    Order getOrderById(UUID orderId);
}
