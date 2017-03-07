package com.frostmaster.musicroutine.userservice.domain.model.entity;

import javax.persistence.Id;
import java.util.UUID;

/**
 * Created by Igor_Usachev on 3/6/2017.
 */
@javax.persistence.Entity
public abstract class Entity {

    @Id
    UUID id;
    String name;

    public Entity() {
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
