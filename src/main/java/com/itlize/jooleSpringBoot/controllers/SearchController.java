package com.itlize.jooleSpringBoot.controllers;


import com.itlize.jooleSpringBoot.entities.Product;
import com.itlize.jooleSpringBoot.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    @Autowired
    ProductService productService;

    @GetMapping("/getAllProduct")
    public ResponseEntity<?> getAllProduct() {
        List<Product> products = productService.findAllProduct();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity searchProduct(@RequestParam(name = "productType") String productType) {
        List<Product> products = (List<Product>) productService.findByProductType(productType);
        return new ResponseEntity<>(products,HttpStatus.OK);
    }
}
