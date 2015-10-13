package com.frosty.musicroutine.dao.impl;

import java.util.List;

import com.frosty.musicroutine.dao.RoutineDao;
import com.frosty.musicroutine.domain.Routine;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class RoutineDaoImpl implements RoutineDao {
	
	@Autowired
	private SessionFactory sessionFactory;


	public void addContact(Routine routine) {
		sessionFactory.getCurrentSession().save(routine);
		
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<Routine> listRoutine() {
		return sessionFactory.getCurrentSession().createQuery("from Routine")
				.list();
	}

	public void removeRoutine(Integer id) {
		Routine contact = (Routine) sessionFactory.getCurrentSession().load(
				Routine.class, id);
		if (null != contact) {
			sessionFactory.getCurrentSession().delete(contact);
		}
		
	}

	@Override
	public void updateRoutine(Routine routine) {
		sessionFactory.getCurrentSession().update(routine);
	}

	@Override
	public Routine getRoutine(Integer id) {
		Routine routine = new Routine();
		routine = (Routine) sessionFactory.getCurrentSession().get(Routine.class, id);
		return routine;
	}
	
}
