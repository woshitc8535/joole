package com.itlize.jooleSpringBoot.services;

import com.itlize.jooleSpringBoot.entities.Project;
import com.itlize.jooleSpringBoot.entities.User;

import java.util.List;

public interface ProjectService {
    List<Project> findByOwner(User user);

    Project creatByOwner(User user, String projectName);

    Project deleteByProjectId(User user, Integer projectId);

    List<Project> deleteAllProject(User user);

    Project updateNameByProjectId(User user , Integer projectId, String projectName);

    Project findByProjectId(Integer projectId);
}
