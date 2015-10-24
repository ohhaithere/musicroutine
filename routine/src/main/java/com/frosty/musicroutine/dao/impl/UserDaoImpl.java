package com.frosty.musicroutine.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.frosty.musicroutine.dao.UsersDao;
import com.frosty.musicroutine.domain.User;

public class UserDaoImpl implements UsersDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
		
	}

	@Override
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeUser(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValidUser(String username, String password){
		// TODO Auto-generated method stub
		return false;
	}
	
}
