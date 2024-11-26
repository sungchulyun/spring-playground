package com.example.springplayground.kafka.controller;

import com.example.springplayground.kafka.producer.TestProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
@RequiredArgsConstructor
@Slf4j
public class kafkaController {

    private final TestProducer testProducer;

    @PostMapping
    @ResponseBody
    public String sendMessage(@RequestParam String message) {
        log.info("message : {}", message);
        testProducer.sendMessage(message);

        return "success";
    }
}
