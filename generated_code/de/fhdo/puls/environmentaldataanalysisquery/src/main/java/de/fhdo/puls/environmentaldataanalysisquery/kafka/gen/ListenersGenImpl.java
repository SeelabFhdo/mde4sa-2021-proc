package de.fhdo.puls.environmentaldataanalysisquery.kafka.gen;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentSensorUnitQueriesService;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentDataReceived;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentSensorUnitCreated;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentSensorUnitUpdated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;

public abstract class ListenersGenImpl implements ListenersGen {

    protected EnvironmentSensorUnitQueriesService environmentSensorUnitQueriesService;

    @Autowired()
    @Override
    public void setEnvironmentSensorUnitQueriesService(EnvironmentSensorUnitQueriesService environmentSensorUnitQueriesService) {
        this.environmentSensorUnitQueriesService = environmentSensorUnitQueriesService;
    }

    @KafkaListener(topics = "${kafka.topic.environmentDataReceivedEvents}", groupId = "${kafka.group.environmentDataReceivedEvents}", containerFactory = "environmentDataReceivedEventsEnvironmentDataReceivedEventsKafkaListenerContainerFactory", errorHandler = "receiveEnvironmentDataReceivedEventsErrorHandler")
    @Override
    public void receiveEnvironmentDataReceivedEventsListener(EnvironmentDataReceived environmentDataReceived) {
        environmentSensorUnitQueriesService.receiveEnvironmentDataReceivedEvents(environmentDataReceived);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveEnvironmentDataReceivedEventsErrorHandler() {
        return (message, exception, consumer) -> environmentSensorUnitQueriesService.receiveEnvironmentDataReceivedEventsErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.environmentSensorUnitCreatedEvents}", groupId = "${kafka.group.environmentSensorUnitCreatedEvents}", containerFactory = "environmentSensorUnitCreatedEventsEnvironmentSensorUnitCreatedEventsKafkaListenerContainerFactory", errorHandler = "receiveEnvironmentSensorUnitCreatedEventsErrorHandler")
    @Override
    public void receiveEnvironmentSensorUnitCreatedEventsListener(EnvironmentSensorUnitCreated environmentSensorUnitCreated) {
        environmentSensorUnitQueriesService.receiveEnvironmentSensorUnitCreatedEvents(environmentSensorUnitCreated);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveEnvironmentSensorUnitCreatedEventsErrorHandler() {
        return (message, exception, consumer) -> environmentSensorUnitQueriesService.receiveEnvironmentSensorUnitCreatedEventsErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.environmentSensorUnitUpdatedEvents}", groupId = "${kafka.group.environmentSensorUnitUpdatedEvents}", containerFactory = "environmentSensorUnitUpdatedEventsEnvironmentSensorUnitUpdatedEventsKafkaListenerContainerFactory", errorHandler = "receiveEnvironmentSensorUnitUpdatedEventsErrorHandler")
    @Override
    public void receiveEnvironmentSensorUnitUpdatedEventsListener(EnvironmentSensorUnitUpdated environmentSensorUnitUpdated) {
        environmentSensorUnitQueriesService.receiveEnvironmentSensorUnitUpdatedEvents(environmentSensorUnitUpdated);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveEnvironmentSensorUnitUpdatedEventsErrorHandler() {
        return (message, exception, consumer) -> environmentSensorUnitQueriesService.receiveEnvironmentSensorUnitUpdatedEventsErrorHandler(message, exception, consumer);
    }
}
