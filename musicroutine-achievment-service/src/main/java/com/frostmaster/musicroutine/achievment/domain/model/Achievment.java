package com.frostmaster.musicroutine.achievment.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Igor_Usachev on 5/4/2017.
 */
@Entity
public class Achievment {

    @Id
    private UUID id;
    private String name;
    private Date date;
    private String pic;
    private UUID userId;

    public Achievment() {
    }

    public Achievment(String name, Date date, String pic, UUID userId) {
        this.setName(name);
        this.setDate(date);
        this.setPic(pic);
        this.setUserId(userId);
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
}
