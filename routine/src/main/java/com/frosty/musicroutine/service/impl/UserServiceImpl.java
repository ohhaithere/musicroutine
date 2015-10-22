package com.frosty.musicroutine.service.impl;

import java.sql.SQLException;

import com.frosty.musicroutine.dao.UsersDao;
import com.frosty.musicroutine.domain.User;
import com.frosty.musicroutine.service.UserService;

public class UserServiceImpl implements UserService {

	private UsersDao userDao;

	public UsersDao getUserDao()
	{
		return this.userDao;
	}

	public void setUserDao(UsersDao userDao)
	{
		this.userDao = userDao;
	}

	@Override
	public boolean isValidUser(String username, String password)
	{
		return userDao.isValidUser(username, password);
	}


	@Override
	public User getUserInfo(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
