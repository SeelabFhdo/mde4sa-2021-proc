package de.fhdo.puls.environmentaldataanalysiscommand.kafka.gen;

import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.EnvironmentSensorUnitCreated;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

public interface KafkaConfigurationGen {

    KafkaAdmin kafkaAdmin();

    ProducerFactory<String, EnvironmentSensorUnitCreated> environmentSensorUnitCreatedEventsProducerFactory();

    KafkaTemplate<String, EnvironmentSensorUnitCreated> environmentSensorUnitCreatedEventsProducer();
}
