package com.frostmaster.musicroutine.progress.domain.repository;

import com.frostmaster.musicroutine.progress.domain.model.Progress;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

/**
 * Created by Igor_Usachev on 4/26/2017.
 */
@RepositoryRestResource(collectionResourceRel = "progress", path = "progress")
public interface ProgressRepository extends PagingAndSortingRepository<Progress, UUID> {



}
