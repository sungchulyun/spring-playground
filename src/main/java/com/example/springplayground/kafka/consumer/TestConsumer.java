package com.example.springplayground.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestConsumer {

    @KafkaListener(topics = "exam-topic", groupId = "group_1", autoStartup = "${kafka.listener.myListenerMethod.enabled}")
    public void listener(Object data) {
      log.info("Consumed Message : {}", data);
    }

}
