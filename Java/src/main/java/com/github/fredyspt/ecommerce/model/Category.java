package com.github.fredyspt.ecommerce.model;

import java.util.ArrayList;
import java.util.UUID;

public class Category {
    private final String id;
    private String name;
    private ArrayList<Product> products;

    public Category(String name){
        id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
