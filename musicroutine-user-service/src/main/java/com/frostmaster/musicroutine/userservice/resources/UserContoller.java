package com.frostmaster.musicroutine.userservice.resources;

import com.frostmaster.musicroutine.userservice.domain.model.entity.User;
import com.frostmaster.musicroutine.userservice.domain.model.valueobject.UserVO;
import com.frostmaster.musicroutine.userservice.domain.service.UserDispatcher;
import com.frostmaster.musicroutine.userservice.domain.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Igor_Usachev on 3/6/2017.
 */
@RestController
@RequestMapping("/v1/user")
public class UserContoller {

    @Autowired
    UserDispatcher workUnitDispatcher;

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody UserVO userVO) throws Exception {
        User user = new User();

        BeanUtils.copyProperties(userVO, user);

        userService.add(user);

        if(workUnitDispatcher != null)
            workUnitDispatcher.dispatch(user);
    }

    @RequestMapping(method = RequestMethod.GET)
    public User get() throws Exception {
        return userService.findByEmail("email@gay.ru");
    }

}
