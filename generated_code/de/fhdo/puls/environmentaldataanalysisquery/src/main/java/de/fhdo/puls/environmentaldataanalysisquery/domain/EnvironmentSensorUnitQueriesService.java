package de.fhdo.puls.environmentaldataanalysisquery.domain;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentDataReceived;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentSensorUnitCreated;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentSensorUnitUpdated;
import de.fhdo.puls.environmentaldataanalysisquery.domain.gen.EnvironmentSensorUnitQueriesServiceGenImpl;
import org.apache.kafka.clients.consumer.Consumer;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends EnvironmentSensorUnitQueriesServiceGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Service()
public class EnvironmentSensorUnitQueriesService extends EnvironmentSensorUnitQueriesServiceGenImpl {

    public void receiveEnvironmentDataReceivedEvents(EnvironmentDataReceived environmentDataReceived) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveEnvironmentDataReceivedEventsErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveEnvironmentSensorUnitCreatedEvents(EnvironmentSensorUnitCreated environmentSensorUnitCreated) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveEnvironmentSensorUnitCreatedEventsErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveEnvironmentSensorUnitUpdatedEvents(EnvironmentSensorUnitUpdated environmentSensorUnitUpdated) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveEnvironmentSensorUnitUpdatedEventsErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public EnvironmentSensorUnitQueriesService() {
    }
}
