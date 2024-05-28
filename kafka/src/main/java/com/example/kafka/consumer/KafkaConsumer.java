package com.example.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = "wycliffe", groupId = "myGroup")
    public void consumeMessage(String message) {
        log.info(format("Consuming message from wycliffe Topic: %s", message));
    }
}
