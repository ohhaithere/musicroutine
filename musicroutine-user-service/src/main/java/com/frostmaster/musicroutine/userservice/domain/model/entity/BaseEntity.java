package com.frostmaster.musicroutine.userservice.domain.model.entity;

import java.util.UUID;

/**
 * Created by Igor_Usachev on 3/6/2017.
 */
public abstract class BaseEntity<T> extends Entity{


    /**
     *
     * @param id
     * @param name
     */
    public BaseEntity(UUID id, String name) {
        super.id = id;
        super.name = name;
    }

    public BaseEntity(String name) {
        super.name = name;
    }


    public BaseEntity() {
    }
}
