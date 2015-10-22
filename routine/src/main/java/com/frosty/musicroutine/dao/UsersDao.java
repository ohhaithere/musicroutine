package com.frosty.musicroutine.dao;

import java.util.List;

import com.frosty.musicroutine.domain.User;

public interface UsersDao {
	public void addUser(User user);
	
	public List<User> listUsers();
	
	public void removeUser(Integer id);
	
	public void updateUser(User user);
	
	public User getUser(Integer id);
	
	public boolean isValidUser(String username, String password);
}
