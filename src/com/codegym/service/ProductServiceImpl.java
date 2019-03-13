package com.codegym.service;

import com.codegym.model.Product;
import java.util.*;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Cake Banana",12,"delicious"));
        products.put(2,new Product(2,"Candy banana",20,"good"));
        products.put(3,new Product(3,"Water",5,"pure"));
        products.put(4,new Product(4,"Noodles",25,"great"));
    }

    @Override
    public List<Product> listProduct() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void create(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findByid(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public Product findByName(String name) {
        Iterator<Product> it = (Iterator<Product>)products.values();
        Product product;
        Product searchProduct=null;
        while (it.hasNext()){
            product=it.next();
            if (product.getName().equals(name)){
                searchProduct = product;

            }
        }
        return searchProduct;
    }
}
