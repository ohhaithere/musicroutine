package com.frostmaster.musicroutine.progress.domain.model.valueobject;

import java.util.UUID;

/**
 * Created by Igor_Usachev on 4/26/2017.
 */
public class ProgressVO {

    UUID id;
    UUID topic;
    Integer progressParam;
    UUID userId;

    public ProgressVO() {
    }

    public ProgressVO(UUID id, UUID topic, Integer progressParam, UUID userId) {
        this.id = id;
        this.topic = topic;
        this.progressParam = progressParam;
        this.userId = userId;
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
