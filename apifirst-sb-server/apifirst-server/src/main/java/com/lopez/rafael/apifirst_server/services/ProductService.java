package com.lopez.rafael.apifirst_server.services;

import guru.springframework.apifirst.model.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    List<Product> listProducts();

    Product getProductById(UUID productId);
}
