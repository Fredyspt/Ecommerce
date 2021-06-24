package com.github.fredyspt.ecommerce.model;

import com.github.fredyspt.ecommerce.util.Constant;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Product {
    private static int counter;
    private final int id;
    private String name;
    private ProductDescription description;
    private String brand;
    private ProductSize size;
    private String color;
    private int price;

    public Product(Map<String, Object> dict){
        id = counter++;

        if (dict.containsKey(Constant.KEY_NAME)) {
            this.setName((String) dict.get(Constant.KEY_NAME));
        }

        if (dict.containsKey(Constant.KEY_DESCRIPTION)) {
            this.setDescription((String) dict.get(Constant.KEY_DESCRIPTION));
        }

        if (dict.containsKey(Constant.KEY_BRAND)) {
            this.setBrand((String) dict.get(Constant.KEY_BRAND));
        }

        if (dict.containsKey(Constant.KEY_SIZE)) {
            this.setSize((String) dict.get(Constant.KEY_SIZE));
        }

        if (dict.containsKey(Constant.KEY_COLOR)) {
            this.setColor((String) dict.get(Constant.KEY_COLOR));
        }

        if (dict.containsKey(Constant.KEY_PRICE)) {
            this.setPrice((Integer) dict.get(Constant.KEY_PRICE));
        }
    }

    public static ArrayList<Product> getDummyData(){
        Map<String, Object> product1 = new TreeMap<>();
        product1.put(Constant.KEY_NAME, "Polo shirt");
        product1.put(Constant.KEY_DESCRIPTION, "Shirt");
        product1.put(Constant.KEY_BRAND, "Polo");
        product1.put(Constant.KEY_SIZE, "M");
        product1.put(Constant.KEY_COLOR, "Blue");
        product1.put(Constant.KEY_PRICE, 1500);

        Map<String, Object> product2 = new TreeMap<>();
        product2.put(Constant.KEY_NAME, "AE Jeans");
        product2.put(Constant.KEY_DESCRIPTION, "Jeans");
        product2.put(Constant.KEY_BRAND, "AE");
        product2.put(Constant.KEY_SIZE, "L");
        product2.put(Constant.KEY_COLOR, "Blue");
        product2.put(Constant.KEY_PRICE, 2000);

        Map<String, Object> product3 = new TreeMap<>();
        product3.put(Constant.KEY_NAME, "Adidas shoes");
        product3.put(Constant.KEY_DESCRIPTION, "Shoes");
        product3.put(Constant.KEY_BRAND, "Adidas");
        product3.put(Constant.KEY_SIZE, "XS");
        product3.put(Constant.KEY_COLOR, "White");
        product3.put(Constant.KEY_PRICE, 1200);


        ArrayList<Product> dummyProducts = new ArrayList<>();
        dummyProducts.add(new Product(product1));
        dummyProducts.add(new Product(product2));
        dummyProducts.add(new Product(product3));

        return dummyProducts;
    }

    public static Product getProductById(int id, ArrayList<Product> products){
        Product selectedProduct = null;
        for(Product product : products){
            if(product.getId() == id){
                selectedProduct = product;
            }
        }

        return selectedProduct;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductDescription getDescription() {
        return description;
    }

    public void setDescription(String description) {
        switch (description){
            case "Shirt":
                this.description = ProductDescription.Shirt;
                break;
            case "Jeans":
                this.description = ProductDescription.Jeans;
                break;
            case "Shoes":
                this.description = ProductDescription.Shoes;
                break;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ProductSize getSize() {
        return size;
    }

    public void setSize(String size) {
        size = size.toUpperCase();
        switch (size){
            case "XS":
                this.size = ProductSize.XS;
                break;
            case "S":
                this.size = ProductSize.S;
                break;
            case "M":
                this.size = ProductSize.M;
                break;
            case "L":
                this.size = ProductSize.L;
                break;
            case "XL":
                this.size = ProductSize.XL;
                break;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
