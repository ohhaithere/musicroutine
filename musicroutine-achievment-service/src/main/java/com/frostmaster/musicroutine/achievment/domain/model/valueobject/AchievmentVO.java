package com.frostmaster.musicroutine.achievment.domain.model.valueobject;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Igor_Usachev on 5/4/2017.
 */
public class AchievmentVO {

    private UUID id;
    private String name;
    private Date date;
    private String pic;
    private UUID user_id;

    public AchievmentVO() {
    }

    public AchievmentVO(String name, Date date, String pic, UUID user_id) {
        this.name = name;
        this.date = date;
        this.pic = pic;
        this.user_id = user_id;
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

    public UUID getUseId() {
        return user_id;
    }

    public void setUserId(UUID user_id) {
        this.user_id = user_id;
    }

}
