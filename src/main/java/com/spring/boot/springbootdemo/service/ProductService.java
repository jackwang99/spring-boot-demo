package com.spring.boot.springbootdemo.service;

import com.spring.boot.springbootdemo.domain.Product;

import java.util.Collection;

public interface ProductService {
    void createProduct(Product product);

    void updateProduct(String id, Product product);

    void deleteProduct(String id);

    Collection<Product> getProducts();
}
