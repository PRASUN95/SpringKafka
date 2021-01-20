package com.example.springkafka.service;

import com.example.springkafka.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class JsonConsumer {
    private final Logger logger = LoggerFactory.getLogger(JsonConsumer.class);

    @KafkaListener(topics = "users", groupId = "group_json")
    public void consume(User user) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", user));
    }
}
