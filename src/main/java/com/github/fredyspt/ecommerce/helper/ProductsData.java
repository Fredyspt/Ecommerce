package com.github.fredyspt.ecommerce.helper;

import com.github.fredyspt.ecommerce.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductsData {

    public static List<Product> getGirlsProducts(){
        return ReadJsonFile.readJson("girls.json");
    }

    public static List<Product> getBoysProducts(){
        return ReadJsonFile.readJson("boys.json");
    }

    public static List<Product> getMenProducts(){
        return ReadJsonFile.readJson("men.json");
    }

    public static List<Product> getWomenProducts(){
        return ReadJsonFile.readJson("women.json");
    }

    public static ArrayList<Product> getAllProducts(){
        ArrayList<Product> products = new ArrayList<>();
        products.addAll(getBoysProducts());
        products.addAll(getGirlsProducts());
        products.addAll(getWomenProducts());
        products.addAll(getMenProducts());
        return products;
    }
}
