package com.frostmaster.musicroutine.userservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Igor_Usachev on 3/7/2017.
 */
@Component
@ConfigurationProperties(prefix = "kafka.producer")
public class KafkaProducerProps {

    private String bootstrap;
    private String topic;

    public String getBootstrap() {
        return bootstrap;
    }

    public void setBootstrap(String bootstrap) {
        this.bootstrap = bootstrap;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

}
