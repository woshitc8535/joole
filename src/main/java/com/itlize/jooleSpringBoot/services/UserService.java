package com.itlize.jooleSpringBoot.services;

import com.itlize.jooleSpringBoot.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    User findByUsername(String username);

    List<User> findAllUsers();

}
