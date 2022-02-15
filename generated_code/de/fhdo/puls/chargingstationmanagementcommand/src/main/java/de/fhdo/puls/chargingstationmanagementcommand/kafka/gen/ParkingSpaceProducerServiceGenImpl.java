package de.fhdo.puls.chargingstationmanagementcommand.kafka.gen;

import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.ParkingSpaceCreated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;

public abstract class ParkingSpaceProducerServiceGenImpl implements ParkingSpaceProducerServiceGen {

    protected KafkaTemplate<String, ParkingSpaceCreated> parkingSpaceCreatedEventsProducer;

    @Autowired()
    @Override
    public void setParkingSpaceCreatedEventsProducer(KafkaTemplate<String, ParkingSpaceCreated> parkingSpaceCreatedEventsProducer) {
        this.parkingSpaceCreatedEventsProducer = parkingSpaceCreatedEventsProducer;
    }

    @Value(value = "${kafka.topic.parkingSpaceCreatedEvents}")
    protected String parkingSpaceCreatedEventsTopic;

    @Override
    public ListenableFuture<SendResult<String, ParkingSpaceCreated>> sendParkingSpaceCreatedEvent(ParkingSpaceCreated parkingSpaceCreated) {
        return parkingSpaceCreatedEventsProducer.send(parkingSpaceCreatedEventsTopic, parkingSpaceCreated);
    }
}
