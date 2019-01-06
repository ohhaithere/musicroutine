package com.frostmaster.musicroutine.userservice.resources;

import com.frostmaster.musicroutine.userservice.domain.model.entity.User;
import com.frostmaster.musicroutine.userservice.domain.model.valueobject.RegisterUserVO;
import com.frostmaster.musicroutine.userservice.domain.model.valueobject.UserVO;
import com.frostmaster.musicroutine.userservice.domain.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("")
public class UserContoller {

  //  @Autowired
  //  UserDispatcher userDispatcher;

    @Autowired
    private UserService userService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody RegisterUserVO userVO) throws Exception {
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
