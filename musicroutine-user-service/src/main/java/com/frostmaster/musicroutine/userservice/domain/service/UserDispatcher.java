package com.frostmaster.musicroutine.userservice.domain.service;

import com.frostmaster.musicroutine.userservice.domain.model.entity.User;

/**
 * Created by Igor_Usachev on 3/13/2017.
 */
public interface UserDispatcher {

    public boolean dispatch(User user);

}
