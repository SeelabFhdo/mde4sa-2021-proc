package de.fhdo.puls.chargingstationmanagementcommand.kafka.gen;

import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.ElectrifiedParkingSpaceCreated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;

public abstract class ElectrifiedParkingSpaceProducerServiceGenImpl implements ElectrifiedParkingSpaceProducerServiceGen {

    protected KafkaTemplate<String, ElectrifiedParkingSpaceCreated> electrifiedParkingSpaceCreatedEventsProducer;

    @Autowired()
    @Override
    public void setElectrifiedParkingSpaceCreatedEventsProducer(KafkaTemplate<String, ElectrifiedParkingSpaceCreated> electrifiedParkingSpaceCreatedEventsProducer) {
        this.electrifiedParkingSpaceCreatedEventsProducer = electrifiedParkingSpaceCreatedEventsProducer;
    }

    @Value(value = "${kafka.topic.electrifiedParkingSpaceCreatedEvents}")
    protected String electrifiedParkingSpaceCreatedEventsTopic;

    @Override
    public ListenableFuture<SendResult<String, ElectrifiedParkingSpaceCreated>> sendElectrifiedParkingSpaceCreatedEvent(ElectrifiedParkingSpaceCreated electrifiedParkingSpaceCreated) {
        return electrifiedParkingSpaceCreatedEventsProducer.send(electrifiedParkingSpaceCreatedEventsTopic, electrifiedParkingSpaceCreated);
    }
}
