package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private int price;
    private String describe;

    public Product(){}
    public Product(int id, String name, int price, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
