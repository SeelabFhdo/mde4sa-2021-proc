package de.fhdo.puls.chargingstationsharingquery.kafka.gen;

import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.ElectrifiedParkingSpaceOffered;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.OfferedElectrifiedParkingSpaceWithdrawed;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.OfferedParkingSpaceWithdrawed;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.ParkingSpaceOffered;
import de.fhdo.puls.chargingstationsharingquery.domain.ParkingSpaceSharingQueriesService;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;

public interface ListenersGen {

    void setParkingSpaceSharingQueriesService(ParkingSpaceSharingQueriesService parkingSpaceSharingQueriesService);

    void receiveParkingSpaceOfferedEventsListener(ParkingSpaceOffered parkingSpaceOffered);

    ConsumerAwareListenerErrorHandler receiveParkingSpaceOfferedEventsErrorHandler();

    void receiveParkingSpaceWithdrawedEventsListener(OfferedParkingSpaceWithdrawed offeredParkingSpaceWithdrawed);

    ConsumerAwareListenerErrorHandler receiveParkingSpaceWithdrawedEventsErrorHandler();

    void receiveElectrifiedParkingSpaceOfferedEventsListener(ElectrifiedParkingSpaceOffered electrifiedParkingSpaceOffered);

    ConsumerAwareListenerErrorHandler receiveElectrifiedParkingSpaceOfferedEventsErrorHandler();

    void receiveElectrifiedParkingSpaceWithdrawedEventsListener(OfferedElectrifiedParkingSpaceWithdrawed offeredElectrifiedParkingSpaceWithdrawed);

    ConsumerAwareListenerErrorHandler receiveElectrifiedParkingSpaceWithdrawedEventsErrorHandler();
}
