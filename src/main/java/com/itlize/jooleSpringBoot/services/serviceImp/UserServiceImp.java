package com.itlize.jooleSpringBoot.services.serviceImp;


import com.itlize.jooleSpringBoot.entities.User;
import com.itlize.jooleSpringBoot.repositories.UserRepository;
import com.itlize.jooleSpringBoot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

//    @Autowired
//    ProjectService projectService;

    @Override
    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setPassword(user.getPassword());
        return userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
//        return userRepository.findByUsername(username).orElse(null);
        return userRepository.findById(username).orElse(null);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }


}
