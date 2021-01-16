package com.example.springkafka.controllers;

import com.example.springkafka.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;

    @Autowired
    KafkaController(Producer producer) {
        this.producer = producer;
    }

    @GetMapping(value = "/publish/{message}")
    public String sendMessageToKafkaTopic(@PathVariable String message) {
        this.producer.sendMessage(message);
        return "Success";
    }
}
