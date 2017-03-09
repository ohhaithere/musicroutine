package com.frostmaster.musicroutine.userservice.domain.service;

import com.frostmaster.musicroutine.userservice.domain.model.entity.User;

/**
 * Created by Igor_Usachev on 3/9/2017.
 */
public interface UserService {

    public void add(User user) throws Exception;

    public void update(User booking) throws Exception;

    public User findById(String restaurantId) throws Exception;

    public User findByEmail(String email) throws Exception;

    public boolean exists(User user);

}
