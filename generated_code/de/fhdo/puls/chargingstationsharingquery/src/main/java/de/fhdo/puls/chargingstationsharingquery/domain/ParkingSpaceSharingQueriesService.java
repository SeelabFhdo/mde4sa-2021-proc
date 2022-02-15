package de.fhdo.puls.chargingstationsharingquery.domain;

import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.ElectrifiedParkingSpaceOffered;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.OfferedElectrifiedParkingSpaceWithdrawed;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.OfferedParkingSpaceWithdrawed;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.ParkingSpaceOffered;
import de.fhdo.puls.chargingstationsharingquery.domain.gen.ParkingSpaceSharingQueriesServiceGenImpl;
import org.apache.kafka.clients.consumer.Consumer;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkingSpaceSharingQueriesServiceGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Service()
public class ParkingSpaceSharingQueriesService extends ParkingSpaceSharingQueriesServiceGenImpl {

    public void receiveParkingSpaceOfferedEvents(ParkingSpaceOffered parkingSpaceOffered) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveParkingSpaceOfferedEventsErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveParkingSpaceWithdrawedEvents(OfferedParkingSpaceWithdrawed offeredParkingSpaceWithdrawed) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveParkingSpaceWithdrawedEventsErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveElectrifiedParkingSpaceOfferedEvents(ElectrifiedParkingSpaceOffered electrifiedParkingSpaceOffered) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveElectrifiedParkingSpaceOfferedEventsErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveElectrifiedParkingSpaceWithdrawedEvents(OfferedElectrifiedParkingSpaceWithdrawed offeredElectrifiedParkingSpaceWithdrawed) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveElectrifiedParkingSpaceWithdrawedEventsErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public ParkingSpaceSharingQueriesService() {
    }
}
