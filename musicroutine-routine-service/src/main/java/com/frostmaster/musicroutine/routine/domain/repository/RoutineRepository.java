package com.frostmaster.musicroutine.routine.domain.repository;

import com.frostmaster.musicroutine.routine.domain.model.Routine;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Created by Igor_Usachev on 3/28/2017.
 */
@Repository
public interface RoutineRepository extends PagingAndSortingRepository<Routine, UUID> {
}
