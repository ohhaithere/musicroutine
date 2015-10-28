package com.frosty.musicroutine.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frosty.musicroutine.dao.UsersDao;
import com.frosty.musicroutine.domain.Routine;
import com.frosty.musicroutine.domain.User;

@Repository
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
		List<User> routine = new ArrayList<User>();
		routine = sessionFactory.getCurrentSession().createQuery("from User where user_name = '"  +username + "' and user_password = '" +password + "'").list();
		try{
			routine.get(0);
			return true;
		} catch(Exception e){
			return false;
		}
	}
	
}
