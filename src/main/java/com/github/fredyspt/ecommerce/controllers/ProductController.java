package com.github.fredyspt.ecommerce.controllers;

import com.github.fredyspt.ecommerce.exceptions.GenericBadRequest;
import com.github.fredyspt.ecommerce.helper.ProductsData;
import com.github.fredyspt.ecommerce.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/*")
// @RestController - every method in the class returns a domain object instead of a view
@RestController
public class ProductController {
    public List<Product> products = ProductsData.getAllProducts();

    // Allowing requests from origins
    @CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})

    @GetMapping("/product")
    public List<Product> getProducts (){
        return products;
    }

    @GetMapping("/product/{productId}")
    public Product findProductById(@PathVariable(value = "productId") int productId){
        if(Product.getProductById(productId, products) == null){
            throw new GenericBadRequest("Could not find an item with the given id");
        }

        return Product.getProductById(productId, products);
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
