package com.frostmaster.musicroutine.progress.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

/**
 * Created by Igor_Usachev on 4/26/2017.
 */
@Entity
public class Progress {

    @Id
    private UUID id;
    private UUID topic;
    private Integer progressParam;
    private UUID userId;

    public Progress() {
    }

    public Progress(UUID topic, Integer progressParam, UUID userId) {
        this.setId(UUID.randomUUID());
        this.setTopic(topic);
        this.setProgressParam(progressParam);
        this.setUserId(userId);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getTopic() {
        return topic;
    }

    public void setTopic(UUID topic) {
        this.topic = topic;
    }

    public Integer getProgressParam() {
        return progressParam;
    }

    public void setProgressParam(Integer progressParam) {
        this.progressParam = progressParam;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
}
