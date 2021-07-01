package com.github.fredyspt.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.fredyspt.ecommerce.util.Constant;

import java.util.ArrayList;
import java.util.Map;

public class Product {
    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("brand")
    private String brand;

    @JsonProperty("size")
    private ProductSize size;

    @JsonProperty("color")
    private String color;

    @JsonProperty("price")
    private int price;

    public Product(Map<String, Object> dict){
        Constant.NUMBER_OF_PRODUCTS++;
        id = Constant.NUMBER_OF_PRODUCTS - 1;

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

    public Product(){
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
