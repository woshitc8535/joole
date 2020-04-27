package com.itlize.jooleSpringBoot.repositories;

import com.itlize.jooleSpringBoot.entities.Project;
import com.itlize.jooleSpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    Optional<List<Project>> findAllByOwner(User user);

    Optional<Project> findByOwnerAndId(User user, Integer id);

    Optional<List<Project>> deleteProjectsByOwner(User user);


}
