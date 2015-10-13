package com.frosty.musicroutine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.frosty.musicroutine.dao.RoutineDao;
import com.frosty.musicroutine.domain.Routine;
import com.frosty.musicroutine.service.RoutineService;

@Service
public class RoutineServiceImpl implements RoutineService {
	
	@Autowired
    private RoutineDao routineDao;


	@Transactional
	public void addContact(Routine contact) {
		routineDao.addContact(contact);
		
	}


	@Transactional
	public List<Routine> listRoutine() {
		return routineDao.listRoutine();
	}


	@Transactional
	public void removeRoutine(Integer id) {
		routineDao.removeRoutine(id);
		
	}


	@Transactional
	public void updateRoutine(Routine routine) {
		routineDao.updateRoutine(routine);
	}


	@Override
	public Routine getRoutine(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
