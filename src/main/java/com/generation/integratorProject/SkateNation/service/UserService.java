package com.generation.integratorProject.SkateNation.service;

import com.generation.integratorProject.SkateNation.model.User;

import java.util.List;

public interface UserService {

    User getUser (Long id);

    List<User> getUsers();

    User save (User user);

    void delete (Long id);
}
