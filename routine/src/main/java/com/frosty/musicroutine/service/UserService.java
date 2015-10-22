package com.frosty.musicroutine.service;

import java.sql.SQLException;

import com.frosty.musicroutine.domain.User;


public interface UserService
{
	public boolean isValidUser(String username, String password);
	
	public User getUserInfo(Integer id);
}

