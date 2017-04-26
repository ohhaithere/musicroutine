package com.frostmaster.musicroutine.routine.domain.service.impl;

import com.frostmaster.musicroutine.routine.domain.model.Routine;
import com.frostmaster.musicroutine.routine.domain.repository.RoutineRepository;
import com.frostmaster.musicroutine.routine.domain.service.RoutineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Igor_Usachev on 3/28/2017.
 */
@Service("routineService")
public class RoutineServiceImpl implements RoutineService {

    @Autowired
    RoutineRepository repository;

    @Override
    public void add(Routine routine) throws Exception {
        routine.setId(UUID.randomUUID());
        repository.save(routine);
    }

    @Override
    public void update(Routine routine) throws Exception {
        repository.save(routine);
    }

    @Override
    public void delete(Routine routine) throws Exception {
        repository.delete(routine);
    }

    @Override
    public Routine findbyId(UUID id) throws Exception {
        return repository.findOne(id);
    }
}
