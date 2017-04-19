package com.frostmaster.musicroutine.routine.domain.repository;

import com.frostmaster.musicroutine.routine.domain.model.Routine;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

/**
 * Created by Igor_Usachev on 3/28/2017.
 */
@RepositoryRestResource(collectionResourceRel = "routine", path = "routines")
public interface RoutineRepository extends PagingAndSortingRepository<Routine, UUID> {


}
