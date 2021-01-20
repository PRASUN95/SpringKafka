package com.example.springkafka.controllers;

import com.example.springkafka.models.User;
import com.example.springkafka.service.JsonProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final JsonProducer jsonProducer;

    @Autowired
    KafkaController(JsonProducer jsonProducer) {
        this.jsonProducer = jsonProducer;
    }

    @GetMapping(value = "/publish/{message}")
    public String sendMessageToKafkaTopic(@PathVariable String message) {
        this.jsonProducer.sendMessage(new User(message,"1"));
        return "Success";
    }
}
