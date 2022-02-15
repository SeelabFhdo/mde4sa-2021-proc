package de.fhdo.puls.environmentaldataanalysisquery.kafka.gen;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentSensorUnitQueriesService;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentDataReceived;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentSensorUnitCreated;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentSensorUnitUpdated;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;

public interface ListenersGen {

    void setEnvironmentSensorUnitQueriesService(EnvironmentSensorUnitQueriesService environmentSensorUnitQueriesService);

    void receiveEnvironmentDataReceivedEventsListener(EnvironmentDataReceived environmentDataReceived);

    ConsumerAwareListenerErrorHandler receiveEnvironmentDataReceivedEventsErrorHandler();

    void receiveEnvironmentSensorUnitCreatedEventsListener(EnvironmentSensorUnitCreated environmentSensorUnitCreated);

    ConsumerAwareListenerErrorHandler receiveEnvironmentSensorUnitCreatedEventsErrorHandler();

    void receiveEnvironmentSensorUnitUpdatedEventsListener(EnvironmentSensorUnitUpdated environmentSensorUnitUpdated);

    ConsumerAwareListenerErrorHandler receiveEnvironmentSensorUnitUpdatedEventsErrorHandler();
}
