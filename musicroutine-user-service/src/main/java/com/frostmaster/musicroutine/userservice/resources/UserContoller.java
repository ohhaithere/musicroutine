package com.frostmaster.musicroutine.userservice.resources;

import com.frostmaster.musicroutine.userservice.domain.model.entity.User;
import com.frostmaster.musicroutine.userservice.domain.repository.UserRepository;
import com.frostmaster.musicroutine.userservice.domain.service.UserDispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by Igor_Usachev on 3/6/2017.
 */
@RestController
@RequestMapping("/v1/user")
public class UserContoller {

    @Autowired
    private UserDispatcher workUnitDispatcher;

    @Autowired
    UserRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public void test(){
        User user = new User("test","test","test");
        UUID uuid = UUID.randomUUID();
        user.setId(uuid);
        repository.save(user);
        workUnitDispatcher.dispatch(user);
    }

}
