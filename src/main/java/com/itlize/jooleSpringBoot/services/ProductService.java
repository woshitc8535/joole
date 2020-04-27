package com.itlize.jooleSpringBoot.services;

import com.itlize.jooleSpringBoot.entities.Product;

import java.util.List;

public interface ProductService {
    Product creatProduct(Product product);

    List<Product> findByProductType(String productType);

    List<Product> findAllProduct();

    Product findByProductId(Integer productId);

}
