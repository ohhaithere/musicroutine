package com.frostmaster.musicroutine.userservice.resources;

import com.frostmaster.musicroutine.userservice.domain.model.entity.User;
import com.frostmaster.musicroutine.userservice.domain.model.valueobject.UserVO;
import com.frostmaster.musicroutine.userservice.domain.service.UserDispatcher;
import com.frostmaster.musicroutine.userservice.domain.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Igor_Usachev on 3/6/2017.
 */
@RestController
@RequestMapping("/v1/user")
public class UserContoller {

    @Autowired
    UserDispatcher userDispatcher;

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody UserVO userVO) throws Exception {
        User user = new User();

        BeanUtils.copyProperties(userVO, user);

        userService.add(user);

        //userDispatcher.dispatch(user);
    }

    @RequestMapping("/{id}")
    public User get(@PathVariable("id") String id) throws Exception {
        User user = userService.findById(id);
        return user;
    }

    @RequestMapping
    public Iterable<User> getAll() throws Exception {
        return userService.getAll();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody UserVO userVO) throws Exception {
        User user = new User();

        BeanUtils.copyProperties(userVO, user);

        userService.update(user);

    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestBody UserVO userVO) throws Exception {
        User user = new User();

        BeanUtils.copyProperties(userVO, user);

        userService.delete(user);

    }

}
