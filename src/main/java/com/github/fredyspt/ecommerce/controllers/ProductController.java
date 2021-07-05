package com.github.fredyspt.ecommerce.controllers;

import com.github.fredyspt.ecommerce.exceptions.NotFoundException;
import com.github.fredyspt.ecommerce.helper.ProductsData;
import com.github.fredyspt.ecommerce.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/*")
// @RestController - every method in the class returns a domain object instead of a view
@RestController
public class ProductController {
    public List<Product> products = ProductsData.getAllProducts();

    private Product findProductById(int id, List<Product> products) {
        Product product = Product.getProductById(id, products);

        if(product == null){
            throw new NotFoundException();
        }

        return product;
    }

    // Allowing requests from origins
    @CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})

    @GetMapping("/product")
    public List<Product> getProducts (){
        return products;
    }

//MEN PRODUCT ID
    @GetMapping("/product/men/{id}")
    public Product getMenProductById(@PathVariable(value = "id") int id){
        return findProductById(id, ProductsData.getMenProducts());
    }

    @GetMapping("/product/boys/{id}")
    public Product findBoysProductById(@PathVariable(value = "id") int id) {
        return findProductById(id, ProductsData.getBoysProducts());
    }
//GIRLS PRODUCT ID
    @GetMapping("/product/girls/{id}")
    public Product findGirlsProductById(@PathVariable(value = "id") int id){
        return findProductById(id, ProductsData.getGirlsProducts());
    }
//WOMEN PRODUCT ID
    @GetMapping("/product/women/{id}")
    public Product findWomenProductById(@PathVariable(value = "id") int id){
        return findProductById(id, ProductsData.getWomenProducts());
    }

    @GetMapping("/product/boys")
    public List<Product> getBoysProducts (){
        return ProductsData.getBoysProducts();
    }

    @GetMapping("/product/girls")
    public List<Product> getGirlsProducts (){
        return ProductsData.getGirlsProducts();
    }

    @GetMapping("/product/men")
    public List<Product> getMenProducts (){
        return ProductsData.getMenProducts();
    }

    @GetMapping("/product/women")
    public List<Product> getWomenProducts (){
        return ProductsData.getWomenProducts();
    }
}
