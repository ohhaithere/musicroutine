package com.frostmaster.musicroutine.userservice.domain.model.entity;

import javax.persistence.Entity;
import java.util.UUID;

/**
 * Created by Igor_Usachev on 3/6/2017.
 */
@Entity
public class User extends BaseEntity<UUID>{

    private String password;
    private String email;

    public User(String name, String password, String email) {
        super(name);
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
