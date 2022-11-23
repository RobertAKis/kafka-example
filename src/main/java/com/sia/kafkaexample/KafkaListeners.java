package com.sia.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics ="zeTopic", groupId = "ze")
    void listener(String data){
        System.out.println("Listener received: " + data);
    }
}
