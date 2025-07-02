package com.ecommerce.simplewebapp.controller;

import com.ecommerce.simplewebapp.model.Product;
import com.ecommerce.simplewebapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getproducts(){

        return service.getProducts();

    }
    @GetMapping("/products/{prodid}")
    public Product getProductbyid(@PathVariable int prodid){
        return service.getProductbyid(prodid);
    }
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.addProduct(prod);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        System.out.println("in here to update");
        service.updateProduct(prod);
    }
    @DeleteMapping("/products/{prodid}")
    public void deleteProduct(@PathVariable int prodid){
        service.deleteProduct(prodid);
    }
}
