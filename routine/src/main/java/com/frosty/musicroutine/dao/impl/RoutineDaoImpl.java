package com.frosty.musicroutine.dao.impl;

import java.util.List;

import com.frosty.musicroutine.dao.RoutineDao;
import com.frosty.musicroutine.domain.Routine;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoutineDaoImpl implements RoutineDao {
	
	@Autowired
	private SessionFactory sessionFactory;


	@Override
	public void addContact(Routine routine) {
		sessionFactory.getCurrentSession().save(routine);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Routine> listRoutine() {
		return sessionFactory.getCurrentSession().createQuery("from routine")
				.list();
	}

	@Override
	public void removeRoutine(Integer id) {
		Routine contact = (Routine) sessionFactory.getCurrentSession().load(
				Routine.class, id);
		if (null != contact) {
			sessionFactory.getCurrentSession().delete(contact);
		}
		
	}
	
}
