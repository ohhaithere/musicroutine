package com.frostmaster.musicroutine.userservice.domain.service;

import com.frostmaster.musicroutine.userservice.domain.model.entity.User;

public interface UserService {

    void add(User user) throws Exception;

    void update(User user) throws Exception;

    void delete(User user) throws Exception;

    User findById(String userId) throws Exception;

    Iterable<User> getAll() throws Exception;

    User findByEmail(String email) throws Exception;

    boolean exists(User user);

}
