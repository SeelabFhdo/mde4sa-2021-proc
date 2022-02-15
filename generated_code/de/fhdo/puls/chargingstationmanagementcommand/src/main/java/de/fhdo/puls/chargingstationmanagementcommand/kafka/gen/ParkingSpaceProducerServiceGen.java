package de.fhdo.puls.chargingstationmanagementcommand.kafka.gen;

import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.ParkingSpaceCreated;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;

public interface ParkingSpaceProducerServiceGen {

    void setParkingSpaceCreatedEventsProducer(KafkaTemplate<String, ParkingSpaceCreated> parkingSpaceCreatedEventsProducer);

    ListenableFuture<SendResult<String, ParkingSpaceCreated>> sendParkingSpaceCreatedEvent(ParkingSpaceCreated parkingSpaceCreated);
}
