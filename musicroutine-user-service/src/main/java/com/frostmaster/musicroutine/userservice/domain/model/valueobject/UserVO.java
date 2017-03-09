package com.frostmaster.musicroutine.userservice.domain.model.valueobject;

/**
 * Created by Igor_Usachev on 3/9/2017.
 */
public class UserVO {

    private String id;
    private String name;
    private String password;
    private String email;

    public UserVO() {
    }

    public UserVO(String id, String name, String password, String email) {
        this.setId(id);
        this.setName(name);
        this.setPassword(password);
        this.setEmail(email);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
