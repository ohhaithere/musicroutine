package com.frostmaster.musicroutine.userservice.domain.service.impl;

import com.frostmaster.musicroutine.userservice.domain.model.entity.User;
import com.frostmaster.musicroutine.userservice.domain.repository.UserRepository;
import com.frostmaster.musicroutine.userservice.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Igor_Usachev on 3/9/2017.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public void add(User user) throws Exception {
        UUID uuid = UUID.randomUUID();
        user.setId(uuid);
        repository.save(user);
    }

    @Override
    public void update(User user) throws Exception {
        repository.save(user);
    }

    @Override
    public void delete(User user) throws Exception {
        repository.delete(user);
    }

    @Override
    public User findById(String userId) throws Exception {
        return repository.findOne(UUID.fromString(userId));
    }

    @Override
    public User findByEmail(String email) throws Exception {
        return repository.findByEmail(email);
    }

    @Override
    public boolean exists(User user){
        User userToFind = null;
        userToFind = repository.findOne(userToFind.getId());
        if(userToFind != null)
            return true;
        else
            return false;
    }
}
