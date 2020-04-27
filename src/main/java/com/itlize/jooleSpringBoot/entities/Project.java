package com.itlize.jooleSpringBoot.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;


@EnableJpaAuditing
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String projectName;

    @ManyToOne(targetEntity = User.class)
    private User owner;

    @JsonIgnore
    @OneToMany(targetEntity = ProductToProject.class, cascade = CascadeType.REMOVE, mappedBy = "project")
    private Set<Product> products = new HashSet<>();


    @CreatedDate
    private Date timeCreated;
    @LastModifiedDate
    private Date lastUpdated;


    public Project() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", owner=" + owner +
                ", products=" + products +
                ", timeCreated=" + timeCreated +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
