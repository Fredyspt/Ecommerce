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
//MEN PRODUCT ID
    @GetMapping("/product/men/{id}")
    public Product findMenProductById(@PathVariable(value = "id") int id){
      if(Product.getMenProductById(id, products) == null){
          throw new GenericBadRequest("Could not find an item with the given id");
     }
      return Product.getMenProductById(id, products);
    }
//BOYS PRODUCT ID
    @GetMapping("/product/boys/{id}")
    public Product findBoysProductById(@PathVariable(value = "id") int id) {
        if (Product.getBoysProductById(id, products) == null) {
            throw new GenericBadRequest("Could not find an item with the given id");
        }
        return Product.getBoysProductById(id, products);
    }
//GIRLS PRODUCT ID
    @GetMapping("/product/girls/{id}")
    public Product findGirlsProductById(@PathVariable(value = "id") int id){
        if(Product.getGirlsProductById(id, products) == null){
            throw new GenericBadRequest("Could not find an item with the given id");
        }
        return Product.getGirlsProductById(id, products);
    }
//WOMEN PRODUCT ID
    @GetMapping("/product/women/{id}")
    public Product findWomenProductById(@PathVariable(value = "id") int id){
        if(Product.getWomenProductById(id, products) == null){
            throw new GenericBadRequest("Could not find an item with the given id");
        }
        return Product.getWomenProductById(id, products);
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
