package de.fhdo.puls.chargingstationmanagementcommand.kafka.gen;

import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.ElectrifiedParkingSpaceCreated;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;

public interface ElectrifiedParkingSpaceProducerServiceGen {

    void setElectrifiedParkingSpaceCreatedEventsProducer(KafkaTemplate<String, ElectrifiedParkingSpaceCreated> electrifiedParkingSpaceCreatedEventsProducer);

    ListenableFuture<SendResult<String, ElectrifiedParkingSpaceCreated>> sendElectrifiedParkingSpaceCreatedEvent(ElectrifiedParkingSpaceCreated electrifiedParkingSpaceCreated);
}
