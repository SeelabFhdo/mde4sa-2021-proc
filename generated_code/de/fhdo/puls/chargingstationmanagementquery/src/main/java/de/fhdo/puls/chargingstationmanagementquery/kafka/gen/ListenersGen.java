package de.fhdo.puls.chargingstationmanagementquery.kafka.gen;

import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ElectrifiedParkingSpaceCreated;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ParkingSpaceCreated;
import de.fhdo.puls.chargingstationmanagementquery.domain.ParkingSpaceQueriesService;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;

public interface ListenersGen {

    void setParkingSpaceQueriesService(ParkingSpaceQueriesService parkingSpaceQueriesService);

    void receiveParkingSpaceCreatedEventsListener(ParkingSpaceCreated parkingSpaceCreated);

    ConsumerAwareListenerErrorHandler receiveParkingSpaceCreatedEventsErrorHandler();

    void receiveElectrifiedParkingSpaceCreatedEventsListener(ElectrifiedParkingSpaceCreated electrifiedParkingSpaceCreated);

    ConsumerAwareListenerErrorHandler receiveElectrifiedParkingSpaceCreatedEventsErrorHandler();
}
