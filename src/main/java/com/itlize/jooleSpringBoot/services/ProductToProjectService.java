package com.itlize.jooleSpringBoot.services;


import com.itlize.jooleSpringBoot.entities.Product;
import com.itlize.jooleSpringBoot.entities.ProductToProject;
import com.itlize.jooleSpringBoot.entities.Project;

import java.util.List;


public interface ProductToProjectService {
    ProductToProject addProductIntoProject(Product product, Project project);

    ProductToProject deleteProductFromProject(Product product, Project project);

    List<ProductToProject> findByProject(Project project);

}
