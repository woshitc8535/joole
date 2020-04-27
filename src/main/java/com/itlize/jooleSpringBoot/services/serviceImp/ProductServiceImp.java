package com.itlize.jooleSpringBoot.services.serviceImp;

import com.itlize.jooleSpringBoot.entities.Product;
import com.itlize.jooleSpringBoot.repositories.ProductRepository;
import com.itlize.jooleSpringBoot.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product creatProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findByProductType(String productType) {
        return productRepository.findByProductTypeIsStartingWith(productType).orElse(null);
    }

    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product findByProductId(Integer productId) {
        return productRepository.findById(productId).orElse(null);
    }
}
