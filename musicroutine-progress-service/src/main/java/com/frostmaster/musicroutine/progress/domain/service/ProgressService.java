package com.frostmaster.musicroutine.progress.domain.service;

import com.frostmaster.musicroutine.progress.domain.model.Progress;

import java.util.UUID;

/**
 * Created by Igor_Usachev on 4/26/2017.
 */
public interface ProgressService {

    public void add(Progress progress) throws Exception;

    public void update(Progress progress) throws Exception;

    public void delete(Progress progress) throws Exception;

    public Progress findbyId(UUID id) throws Exception;

}
