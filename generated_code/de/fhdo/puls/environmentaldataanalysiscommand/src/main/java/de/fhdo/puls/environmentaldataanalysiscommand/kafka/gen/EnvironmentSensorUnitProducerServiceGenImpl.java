package de.fhdo.puls.environmentaldataanalysiscommand.kafka.gen;

import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.EnvironmentSensorUnitCreated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;

public abstract class EnvironmentSensorUnitProducerServiceGenImpl implements EnvironmentSensorUnitProducerServiceGen {

    protected KafkaTemplate<String, EnvironmentSensorUnitCreated> environmentSensorUnitCreatedEventsProducer;

    @Autowired()
    @Override
    public void setEnvironmentSensorUnitCreatedEventsProducer(KafkaTemplate<String, EnvironmentSensorUnitCreated> environmentSensorUnitCreatedEventsProducer) {
        this.environmentSensorUnitCreatedEventsProducer = environmentSensorUnitCreatedEventsProducer;
    }

    @Value(value = "${kafka.topic.environmentSensorUnitCreatedEvents}")
    protected String environmentSensorUnitCreatedEventsTopic;

    @Override
    public ListenableFuture<SendResult<String, EnvironmentSensorUnitCreated>> sendEnvironmentSensorUnitEvent(EnvironmentSensorUnitCreated environmentSensorUnitCreated) {
        return environmentSensorUnitCreatedEventsProducer.send(environmentSensorUnitCreatedEventsTopic, environmentSensorUnitCreated);
    }
}
