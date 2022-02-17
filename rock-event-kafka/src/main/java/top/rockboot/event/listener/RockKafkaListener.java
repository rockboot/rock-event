package top.rockboot.event.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class RockKafkaListener {

    private final Logger logger = LoggerFactory.getLogger(RockKafkaListener.class);

    @KafkaListener(groupId = "RockBootGroup", topics = {"rock-event"})
    public void consumer(@Payload String message) {
        logger.info("Consume Data via [rock-event], message[{}]", message);
    }

}
