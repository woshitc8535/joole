package com.itlize.jooleSpringBoot.repositories;

import com.itlize.jooleSpringBoot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Optional<List<Product>> findByProductTypeIsStartingWith(String productType);

    List<Product> findAll();
}
