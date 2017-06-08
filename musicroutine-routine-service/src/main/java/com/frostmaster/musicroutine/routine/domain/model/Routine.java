package com.frostmaster.musicroutine.routine.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Igor_Usachev on 3/28/2017.
 */
@Entity
public class Routine {

    @Id
    private UUID id;
    private String name;
    private String text;
    private String level;
    private Integer minutes;

    private String instrument;
    private Date dateCreated;

    public Routine() {
    }

    public Routine(String name, String text, String level, Integer minutes) {
        UUID uuid = UUID.randomUUID();
        this.setId(uuid);
        this.setName(name);
        this.setText(text);
        this.setLevel(level);
        this.setMinutes(minutes);
        this.setDateCreated(new Date());
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}
