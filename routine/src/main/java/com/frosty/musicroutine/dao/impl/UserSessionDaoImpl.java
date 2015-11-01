package com.frosty.musicroutine.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frosty.musicroutine.dao.UserSessionDao;
import com.frosty.musicroutine.domain.User;
import com.frosty.musicroutine.domain.UserSession;

@Repository
public class UserSessionDaoImpl implements UserSessionDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addSession(UserSession session) {
		sessionFactory.getCurrentSession().save(session);
	}

	@Override
	public Boolean checkSession(String token) {
		List<User> routine = new ArrayList<User>();
		routine = sessionFactory.getCurrentSession().createQuery("from UserSession where token = '"  +token + "'").list();
		try{
			routine.get(0);
			return true;
		} catch(Exception e){
			return false;
		}
	}
	
	

}
