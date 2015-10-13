package com.frosty.musicroutine.service;

import java.util.List;
import com.frosty.musicroutine.domain.Routine;

public interface RoutineService {
	
	public void addContact(Routine contact);

	public List<Routine> listRoutine();

	public void removeRoutine(Integer id);
	
	public void updateRoutine(Routine routine);

}
