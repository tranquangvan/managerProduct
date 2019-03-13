package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> listProduct();
    void create(Product product);
    Product findByid(int id);
    void update(int id,Product product);
    void remove(int id);
    Product findByName(String name);
}
