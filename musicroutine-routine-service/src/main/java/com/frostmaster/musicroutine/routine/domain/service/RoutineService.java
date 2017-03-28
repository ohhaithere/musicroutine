package com.frostmaster.musicroutine.routine.domain.service;

import com.frostmaster.musicroutine.routine.domain.model.Routine;

/**
 * Created by Igor_Usachev on 3/28/2017.
 */
public interface RoutineService {

    public void add(Routine routine) throws Exception;

    public void update(Routine routine) throws Exception;

}
