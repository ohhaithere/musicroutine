package com.frosty.musicroutine.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.frosty.musicroutine.domain.User;
import com.frosty.musicroutine.service.UserService;
 
@Controller
@RequestMapping(value = "/register")
public class RegisterController {
	
	@Autowired
	private UserService userService;
 
    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model) {
        User userForm = new User();    
        model.put("userForm", userForm);
         
        List<String> professionList = new ArrayList<String>();
        professionList.add("Developer");
        professionList.add("Designer");
        professionList.add("IT Manager");
        model.put("professionList", professionList);
         
        return "Registration";
    }
     
    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") User user,
            Map<String, Object> model) {
         
        User userToRegister = new User();
        
        userToRegister.setDate_created(new Date());
        userToRegister.setUser_name(user.getUser_name());
        userToRegister.setUser_password(user.getUser_password());
        userToRegister.setUser_email(user.getUser_email());
        
        userService.createUser(userToRegister);
         
        // for testing purpose:
        System.out.println("username: " + user.getUser_name());
        System.out.println("password: " + user.getUser_password());
        System.out.println("email: " + user.getUser_email());
         
        return "RegistrationSuccess";
    }
}