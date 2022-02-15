package de.fhdo.puls.environmentaldataanalysiscommand.kafka.gen;

import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.EnvironmentSensorUnitCreated;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;

public interface EnvironmentSensorUnitProducerServiceGen {

    void setEnvironmentSensorUnitCreatedEventsProducer(KafkaTemplate<String, EnvironmentSensorUnitCreated> environmentSensorUnitCreatedEventsProducer);

    ListenableFuture<SendResult<String, EnvironmentSensorUnitCreated>> sendEnvironmentSensorUnitEvent(EnvironmentSensorUnitCreated environmentSensorUnitCreated);
}
