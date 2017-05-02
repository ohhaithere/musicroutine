package com.frostmaster.musicroutine.progress.domain.service.impl;

import com.frostmaster.musicroutine.progress.domain.model.Progress;
import com.frostmaster.musicroutine.progress.domain.repository.ProgressRepository;
import com.frostmaster.musicroutine.progress.domain.service.ProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Igor_Usachev on 4/26/2017.
 */
@Service("progressService")
public class ProgressServiceImpl implements ProgressService {

    @Autowired
    ProgressRepository repository;


    @Override
    public void add(Progress progress) throws Exception {
        repository.save(progress);
    }

    @Override
    public void update(Progress progress) throws Exception {
        repository.save(progress);
    }

    @Override
    public void delete(Progress progress) throws Exception {
        repository.delete(progress);
    }

    @Override
    public Progress findbyId(UUID id) throws Exception {
        return repository.findOne(id);
    }
}
