package com.frostmaster.musicroutine.achievment.domain.service.impl;

import com.frostmaster.musicroutine.achievment.domain.model.Achievment;
import com.frostmaster.musicroutine.achievment.domain.repository.AchievmentRepository;
import com.frostmaster.musicroutine.achievment.domain.service.AchievmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Igor_Usachev on 5/4/2017.
 */
@Service("achievmentService")
public class AchievmentServiceImpl implements AchievmentService{

    @Autowired
    AchievmentRepository repository;

    @Override
    public void add(Achievment achievment) throws Exception {
        achievment.setId(UUID.randomUUID());
        repository.save(achievment);
    }

    @Override
    public void update(Achievment achievment) throws Exception {
        repository.save(achievment);
    }

    @Override
    public void delete(Achievment achievment) throws Exception {
        repository.delete(achievment);
    }

    @Override
    public Achievment findbyId(UUID id) throws Exception {
        return repository.findOne(id);
    }

}
