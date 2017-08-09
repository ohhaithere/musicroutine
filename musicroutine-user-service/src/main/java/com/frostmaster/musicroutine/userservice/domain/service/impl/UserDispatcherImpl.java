package com.frostmaster.musicroutine.userservice.domain.service.impl;

import com.frostmaster.musicroutine.userservice.domain.service.UserDispatcher;
import org.springframework.stereotype.Service;

/**
 * Created by Igor_Usachev on 3/7/2017.
 */
@Service("userDispatcher")
public class UserDispatcherImpl implements UserDispatcher{

   /* @Autowired
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
            return false;
        }*/
    //}



}
