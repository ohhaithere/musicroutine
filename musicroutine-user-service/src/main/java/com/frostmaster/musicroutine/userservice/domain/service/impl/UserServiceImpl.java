package com.frostmaster.musicroutine.userservice.domain.service.impl;

import com.frostmaster.musicroutine.userservice.domain.model.entity.User;
import com.frostmaster.musicroutine.userservice.domain.repository.UserRepository;
import com.frostmaster.musicroutine.userservice.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public void add(User user){
        UUID uuid = UUID.randomUUID();
        user.setId(uuid);
        repository.save(user);
    }

    @Override
    public void update(User user) {
        repository.save(user);
    }

    @Override
    public void delete(User user) {
        repository.delete(user);
    }

    @Override
    public User findById(String userId) {
        return repository.findOne(UUID.fromString(userId));
    }

    @Override
    public Iterable<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public  boolean exists(User user){
        User userToFind = null;
        userToFind = repository.findOne(userToFind.getId());
        return userToFind != null;
    }

}
