package com.lopez.rafael.apifirst_server.services;

import guru.springframework.apifirst.model.Order;
import guru.springframework.apifirst.model.OrderCreate;

import java.util.List;
import java.util.UUID;


public interface OrderService {
    List<Order> listOrders();
    Order getOrderById(UUID orderId);
    Order saveNewOrder(OrderCreate orderCreate);
}
