package com.frostmaster.musicroutine.userservice.domain.repository;

import com.frostmaster.musicroutine.userservice.domain.model.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

/**
 * Created by Igor_Usachev on 3/7/2017.
 */
@RepositoryRestResource(collectionResourceRel = "user", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, UUID> {

    public User findByEmail(String email);

}
