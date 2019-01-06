package com.frostmaster.musicroutine.userservice.domain.repository;

import com.frostmaster.musicroutine.userservice.domain.model.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, UUID> {

    User findByEmail(String email);

}
