package com.lopez.rafael.apifirst_server.controllers;

import com.lopez.rafael.apifirst_server.services.OrderService;
import guru.springframework.apifirst.model.Order;
import guru.springframework.apifirst.model.OrderCreate;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import static com.lopez.rafael.apifirst_server.controllers.OrderController.BASE_URL;

@RestController
@RequiredArgsConstructor
@RequestMapping(BASE_URL)
public class OrderController {

    public static final String BASE_URL = "/v1/orders";

    private final OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> listOrders(){
        return ResponseEntity.ok(orderService.listOrders());
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getProductById(@PathVariable("orderId") UUID orderId) {
        return ResponseEntity.ok(orderService.getOrderById(orderId));
    }

    @PostMapping
    public ResponseEntity<Void> saveNewOrder(@RequestBody OrderCreate orderCreate){
        Order savedOrder = orderService.saveNewOrder(orderCreate);

        UriComponents uriComponents = UriComponentsBuilder.fromPath(BASE_URL + "/{orderId}")
                .buildAndExpand(savedOrder.getId());

        return ResponseEntity.created(URI.create(uriComponents.getPath())).build();
    }

}
