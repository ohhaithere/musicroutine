package com.frostmaster.musicroutine.userservice.config;

import org.apache.kafka.common.serialization.Serializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.serializer.JsonSerializer;

@Configuration
public class ProducerProps {

 /*   @Bean
    public KafkaProducer<String, User> workUnitProducer(KafkaProducerProps kafkaProducerProperties) {
        Properties kafkaProps = new Properties();
        kafkaProps.put("bootstrap.servers", kafkaProducerProperties.getBootstrap());

//        kafkaProps.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        kafkaProps.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<String, User> producer = new KafkaProducer<String, User>(kafkaProps, stringKeySerializer(), workUnitJsonSerializer());
        return producer;
    }*/

    @Bean
    public Serializer stringKeySerializer() {
        return new StringSerializer();
    }

    @Bean
    public Serializer workUnitJsonSerializer() {
        return new JsonSerializer();
    }

}
