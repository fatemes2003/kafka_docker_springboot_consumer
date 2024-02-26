package org.example.consumer;




import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.Entity.Product;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class KafkaNotificationConsumer {


    //@KafkaHandler
    @KafkaListener(topics = "product4",groupId = "1",containerFactory = "factory")
    void listener(Product product){
        log.warn("====>Consumed  {} from Queue",product);
    }
}
