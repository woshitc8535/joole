package com.itlize.jooleSpringBoot.entities;


import com.itlize.jooleSpringBoot.entities.Product;
import com.itlize.jooleSpringBoot.entities.Project;

import javax.persistence.*;

@Entity
@Table(name = "productToProject")
public class ProductToProject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @ManyToOne(targetEntity = Project.class, cascade = CascadeType.DETACH)
    private Project project;


    @ManyToOne(targetEntity = Product.class, cascade = CascadeType.DETACH)
    private Product product;


    public ProductToProject() {
    }

    public Integer getId() {
        return id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductToProject{" +
                "id=" + id +
                ", project=" + project+
                ", product=" + product +
                '}';
    }
}
