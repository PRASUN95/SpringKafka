package com.example.springkafka.service;

import com.example.springkafka.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class JsonProducer {
    private static final Logger logger = LoggerFactory.getLogger(JsonProducer.class);
    private static final String TOPIC = "users";

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessage(User user) {
        logger.info(String.format("#### -> Producing message -> %s", user));
        this.kafkaTemplate.send(TOPIC, user);
    }
}
