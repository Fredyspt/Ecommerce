package com.github.fredyspt.ecommerce.controllers;

import com.github.fredyspt.ecommerce.exceptions.GenericBadRequest;
import com.github.fredyspt.ecommerce.helper.ProductsData;
import com.github.fredyspt.ecommerce.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/api/*")
// @RestController - every method in the class returns a domain object instead of a view
@RestController
public class ProductController {
    ArrayList<Product> products = ProductsData.getAllProducts();

    // Allowing requests from origins
    @CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})

    @GetMapping("/product")
    // RequestParam binds value of the query string parameter name into the name parameter of this method.
    public ArrayList<Product> getProducts (){
        return products;
    }

    @GetMapping("/product/{productId}")
    public Product findProductById(@PathVariable(value = "productId") int productId){
        if(Product.getProductById(productId, products) == null){
            throw new GenericBadRequest("Could not find an item with the given id");
        }

        return Product.getProductById(productId, products);
    }
}
