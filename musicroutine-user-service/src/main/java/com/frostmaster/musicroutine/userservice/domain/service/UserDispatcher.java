package com.frostmaster.musicroutine.userservice.domain.service;

import com.frostmaster.musicroutine.userservice.config.KafkaProducerProps;
import com.frostmaster.musicroutine.userservice.domain.model.entity.User;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Igor_Usachev on 3/7/2017.
 */
@Service
public class UserDispatcher {

    @Autowired
    private KafkaProducer<String, User> workUnitProducer;

    @Autowired
    private KafkaProducerProps kafkaProducerProperties;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserDispatcher.class);

    public boolean dispatch(User user) {
        ProducerRecord<String, User> record =
                new ProducerRecord<String, User>(kafkaProducerProperties.getTopic(), "gay", user);
        try {
            RecordMetadata recordMetadata = this.workUnitProducer.send(record).get();
            LOGGER.info("topic = {}, partition = {}, offset = {}, workUnit = {}",
                    recordMetadata.topic(), recordMetadata.partition(), recordMetadata.offset(), user);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
