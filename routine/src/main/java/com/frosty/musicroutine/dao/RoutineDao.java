package com.frosty.musicroutine.dao;

import java.util.List;
import com.frosty.musicroutine.domain.Routine;

public interface RoutineDao {
	public void addContact(Routine routine);

	public List<Routine> listRoutine();

	public void removeRoutine(Integer id);

}
