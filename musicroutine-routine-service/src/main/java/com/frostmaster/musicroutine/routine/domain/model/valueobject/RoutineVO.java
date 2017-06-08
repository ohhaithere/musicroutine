package com.frostmaster.musicroutine.routine.domain.model.valueobject;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Igor_Usachev on 4/19/2017.
 */
public class RoutineVO
{

    private UUID id;
    private String name;
    private String text;
    private String level;
    private Integer minutes;

    private String instrument;
    private Date dateCreated;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    RoutineVO(){}

}
