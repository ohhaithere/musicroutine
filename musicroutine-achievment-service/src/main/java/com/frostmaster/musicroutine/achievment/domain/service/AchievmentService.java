package com.frostmaster.musicroutine.achievment.domain.service;

import com.frostmaster.musicroutine.achievment.domain.model.Achievment;

import java.util.UUID;

/**
 * Created by Igor_Usachev on 5/4/2017.
 */
public interface AchievmentService {

    public void add(Achievment achievment) throws Exception;

    public void update(Achievment achievment) throws Exception;

    public void delete(Achievment achievment) throws Exception;

    public Achievment findbyId(UUID id) throws Exception;
}
