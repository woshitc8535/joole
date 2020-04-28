package com.itlize.jooleSpringBoot.services.serviceImp;


import com.itlize.jooleSpringBoot.entities.Product;
import com.itlize.jooleSpringBoot.entities.ProductToProject;
import com.itlize.jooleSpringBoot.entities.Project;
import com.itlize.jooleSpringBoot.repositories.ProductToProjectRepository;
import com.itlize.jooleSpringBoot.services.ProductToProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductToProjectServiceImp implements ProductToProjectService {

    @Autowired
    private ProductToProjectRepository productToProjectRepository;

    @Override
    public ProductToProject addProductIntoProject(Product product, Project project) {
        ProductToProject productToProject = new ProductToProject();
        productToProject.setProduct(product);
        productToProject.setProject(project);
        return productToProjectRepository.save(productToProject);
    }

    @Transactional
    @Override
    public void deleteProductFromProject(Product product, Project project) {
       productToProjectRepository.deleteByProductAndProject(product, project);
    }

    @Override
    public List<ProductToProject> findByProject(Project project) {
        return productToProjectRepository.findByProject(project).orElse(null);
    }
}
