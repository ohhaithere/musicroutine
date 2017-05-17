package com.frostmaster.musicroutine.achievment.domain.repository;

import com.frostmaster.musicroutine.achievment.domain.model.Achievment;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by Igor_Usachev on 5/4/2017.
 */
public interface AchievmentRepository extends PagingAndSortingRepository<Achievment, UUID> {



}
