package com.itlize.jooleSpringBoot.services.serviceImp;

import com.itlize.jooleSpringBoot.entities.Project;
import com.itlize.jooleSpringBoot.entities.User;
import com.itlize.jooleSpringBoot.repositories.ProjectRepository;
import com.itlize.jooleSpringBoot.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectServiceImp implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;


    @Override
    public List<Project> findByOwner(User user) {
        return projectRepository.findAllByOwner(user).orElse(null);
    }

    @Override
    public Project creatByOwner(User user, String projectName) {
        Project project = new Project();
        project.setOwner(user);
        project.setProjectName(projectName);
        return projectRepository.save(project);
    }

    @Override
    public Project deleteByProjectId(User user, Integer projectId) {
        Project project = projectRepository.findByOwnerAndId(user, projectId).orElse(null);
        projectRepository.delete(project);
        return project;
    }

    @Transactional
    @Override
    public List<Project> deleteAllProject(User user) {
        return projectRepository.deleteProjectsByOwner(user).orElse(null);
    }

    @Override
    public Project updateNameByProjectId(User user, Integer projectId, String projectName) {
        Project project = projectRepository.findByOwnerAndId(user, projectId).orElse(null);
        project.setProjectName(projectName);
        return projectRepository.save(project);
    }

    @Override
    public Project findByProjectId(Integer projectId) {
        return projectRepository.findById(projectId).orElse(null);
    }
}
