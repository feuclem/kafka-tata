package fr.core

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.support.Acknowledgment
import org.springframework.stereotype.Component

@Component
class KafkaConsumer {

    private val logger = LoggerFactory.getLogger(javaClass)

    @KafkaListener(topics = ["\${kafka.topics.product}"], groupId = "ppr")
    fun listen(consumerRecord: ConsumerRecord<Any, Any>, ack: Acknowledgment) {
        logger.info("Message received {}", consumerRecord)
        ack.acknowledge()
    }
}