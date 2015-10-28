package com.frosty.musicroutine.service.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frosty.musicroutine.dao.UsersDao;
import com.frosty.musicroutine.domain.User;
import com.frosty.musicroutine.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersDao userDao;

	public UsersDao getUserDao()
	{
		return this.userDao;
	}

	public void setUserDao(UsersDao userDao)
	{
		this.userDao = userDao;
	}

	@Transactional
	public boolean isValidUser(String username, String password)
	{
		return userDao.isValidUser(username, password);
	}


	@Override
	public User getUserInfo(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void createUser(User user) {
		userDao.addUser(user);
		
	}

}
