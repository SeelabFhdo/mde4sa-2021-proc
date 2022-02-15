package de.fhdo.puls.chargingstationmanagementquery.domain;

import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ElectrifiedParkingSpaceCreated;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ParkingSpaceCreated;
import de.fhdo.puls.chargingstationmanagementquery.domain.gen.ParkingSpaceQueriesServiceGenImpl;
import org.apache.kafka.clients.consumer.Consumer;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkingSpaceQueriesServiceGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Service()
public class ParkingSpaceQueriesService extends ParkingSpaceQueriesServiceGenImpl {

    public void receiveParkingSpaceCreatedEvents(ParkingSpaceCreated parkingSpaceCreated) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveParkingSpaceCreatedEventsErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveElectrifiedParkingSpaceCreatedEvents(ElectrifiedParkingSpaceCreated electrifiedParkingSpaceCreated) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveElectrifiedParkingSpaceCreatedEventsErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public ParkingSpaceQueriesService() {
    }
}
