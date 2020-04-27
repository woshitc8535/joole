package com.itlize.jooleSpringBoot.repositories;

import com.itlize.jooleSpringBoot.entities.Product;
import com.itlize.jooleSpringBoot.entities.ProductToProject;
import com.itlize.jooleSpringBoot.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface ProductToProjectRepository extends JpaRepository<ProductToProject, Integer> {
    Optional<ProductToProject> deleteByProductAndProject(Product product, Project project);

    Optional<List<ProductToProject>>findByProject(Project project);

}
