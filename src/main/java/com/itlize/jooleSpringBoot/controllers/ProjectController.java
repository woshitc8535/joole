package com.itlize.jooleSpringBoot.controllers;


import com.itlize.jooleSpringBoot.entities.Product;
import com.itlize.jooleSpringBoot.entities.ProductToProject;
import com.itlize.jooleSpringBoot.entities.Project;
import com.itlize.jooleSpringBoot.entities.User;
import com.itlize.jooleSpringBoot.services.ProductService;
import com.itlize.jooleSpringBoot.services.ProductToProjectService;
import com.itlize.jooleSpringBoot.services.ProjectService;
import com.itlize.jooleSpringBoot.services.UserService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    UserService userService;

    @Autowired
    ProjectService projectService;

    @Autowired
    ProductService productService;

    @Autowired
    ProductToProjectService productToProjectService;

    private User getCurrentUser(Principal principal) {
        UsernamePasswordAuthenticationToken authenticationToken = (UsernamePasswordAuthenticationToken) principal;
        return userService.findByUsername(authenticationToken.getName());
    }

    @GetMapping("/getAllProject")
    public ResponseEntity<?> getAllProject (Principal principal) {
        User currentUser = getCurrentUser(principal);
        List<Project> projects = projectService.findByOwner(currentUser);

        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @GetMapping("getProject")
    public ResponseEntity<?> getProject (@RequestParam(name = "projectId")Integer projectId) {
        Project project = projectService.findByProjectId(projectId);
        List<ProductToProject> productToProject = productToProjectService.findByProject(project);
        return new ResponseEntity<>(productToProject, HttpStatus.OK);
    }


    @GetMapping("/addProject")
    public ResponseEntity<?> addProject(Principal principal, @RequestParam(name = "projectName")String projectName) {
        User currentUser = getCurrentUser(principal);
        Project project = projectService.creatByOwner(currentUser, projectName);
        return new ResponseEntity<>(project, HttpStatus.CREATED);
    }

    @GetMapping("/deleteProject")
    public ResponseEntity<?> deleteProject(Principal principal, @RequestParam(name = "projectId")Integer projectId) {
        User currentUser = getCurrentUser(principal);
        Project project = projectService.deleteByProjectId(currentUser, projectId);
        return new ResponseEntity<>(project, HttpStatus.OK);
    }

    @GetMapping("/deleteAllProject")
    public ResponseEntity<?> deleteAllProject(Principal principal) {
        User currentUser = getCurrentUser(principal);
        List<Project> projects = projectService.deleteAllProject(currentUser);
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @GetMapping("/updateProject")
    public ResponseEntity<?> updateProject(Principal principal, @RequestParam(name = "projectId")Integer projectId
    , @RequestParam(name = "projectName")String projectName) {
        User currentUser = getCurrentUser(principal);
        Project project = projectService.updateNameByProjectId(currentUser, projectId, projectName);
        return new ResponseEntity<>(project, HttpStatus.OK);
    }


    @GetMapping("/addProductToProject")
    public ResponseEntity<?> addProductToProject(@RequestParam(name = "projectId")Integer productId,
                                              @RequestParam(name = "productId")Integer projectId) {
        Project project = projectService.findByProjectId(projectId);
        Product product = productService.findByProductId(productId);

        ProductToProject productToProject = productToProjectService.addProductIntoProject(product, project);
        return new ResponseEntity<>(productToProject, HttpStatus.CREATED);
    }


    @GetMapping("/deleteProductFromProject")
    public ResponseEntity<?> deleteProductFromProject(@RequestParam(name = "projectId")Integer productId,
                                                 @RequestParam(name = "productId")Integer projectId) {
        Project project = projectService.findByProjectId(projectId);
        Product product = productService.findByProductId(productId);

        ProductToProject productToProject = productToProjectService.deleteProductFromProject(product, project);
        return new ResponseEntity<>(productToProject, HttpStatus.OK);
    }

}
