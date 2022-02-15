package de.fhdo.puls.chargingstationsharingcommand.kafka.gen;

import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.ElectrifiedParkingSpaceOffered;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.OfferedElectrifiedParkingSpaceWithdrawed;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.OfferedParkingSpaceWithdrawed;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.ParkingSpaceOffered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;

public abstract class ParkingSpaceSharingProducerServiceGenImpl implements ParkingSpaceSharingProducerServiceGen {

    protected KafkaTemplate<String, ParkingSpaceOffered> parkingSpaceOfferedEventsProducer;

    @Autowired()
    @Override
    public void setParkingSpaceOfferedEventsProducer(KafkaTemplate<String, ParkingSpaceOffered> parkingSpaceOfferedEventsProducer) {
        this.parkingSpaceOfferedEventsProducer = parkingSpaceOfferedEventsProducer;
    }

    @Value(value = "${kafka.topic.parkingSpaceOfferedEvents}")
    protected String parkingSpaceOfferedEventsTopic;

    @Override
    public ListenableFuture<SendResult<String, ParkingSpaceOffered>> sendParkingSpaceOfferedEvent(ParkingSpaceOffered parkingSpaceOffered) {
        return parkingSpaceOfferedEventsProducer.send(parkingSpaceOfferedEventsTopic, parkingSpaceOffered);
    }

    protected KafkaTemplate<String, OfferedParkingSpaceWithdrawed> parkingSpaceWithdrawedEventsProducer;

    @Autowired()
    @Override
    public void setParkingSpaceWithdrawedEventsProducer(KafkaTemplate<String, OfferedParkingSpaceWithdrawed> parkingSpaceWithdrawedEventsProducer) {
        this.parkingSpaceWithdrawedEventsProducer = parkingSpaceWithdrawedEventsProducer;
    }

    @Value(value = "${kafka.topic.parkingSpaceWithdrawedEvents}")
    protected String parkingSpaceWithdrawedEventsTopic;

    @Override
    public ListenableFuture<SendResult<String, OfferedParkingSpaceWithdrawed>> sendParkingSpaceWithdrawedEvent(OfferedParkingSpaceWithdrawed offeredParkingSpaceWithdrawed) {
        return parkingSpaceWithdrawedEventsProducer.send(parkingSpaceWithdrawedEventsTopic, offeredParkingSpaceWithdrawed);
    }

    protected KafkaTemplate<String, ElectrifiedParkingSpaceOffered> electrifiedParkingSpaceOfferedEventsProducer;

    @Autowired()
    @Override
    public void setElectrifiedParkingSpaceOfferedEventsProducer(KafkaTemplate<String, ElectrifiedParkingSpaceOffered> electrifiedParkingSpaceOfferedEventsProducer) {
        this.electrifiedParkingSpaceOfferedEventsProducer = electrifiedParkingSpaceOfferedEventsProducer;
    }

    @Value(value = "${kafka.topic.electrifiedParkingSpaceOfferedEvents}")
    protected String electrifiedParkingSpaceOfferedEventsTopic;

    @Override
    public ListenableFuture<SendResult<String, ElectrifiedParkingSpaceOffered>> sendElectrifiedParkingSpaceOfferedEvent(ElectrifiedParkingSpaceOffered electrifiedParkingSpaceOffered) {
        return electrifiedParkingSpaceOfferedEventsProducer.send(electrifiedParkingSpaceOfferedEventsTopic, electrifiedParkingSpaceOffered);
    }

    protected KafkaTemplate<String, OfferedElectrifiedParkingSpaceWithdrawed> electrifiedParkingSpaceWithdrawedEventsProducer;

    @Autowired()
    @Override
    public void setElectrifiedParkingSpaceWithdrawedEventsProducer(KafkaTemplate<String, OfferedElectrifiedParkingSpaceWithdrawed> electrifiedParkingSpaceWithdrawedEventsProducer) {
        this.electrifiedParkingSpaceWithdrawedEventsProducer = electrifiedParkingSpaceWithdrawedEventsProducer;
    }

    @Value(value = "${kafka.topic.electrifiedParkingSpaceWithdrawedEvents}")
    protected String electrifiedParkingSpaceWithdrawedEventsTopic;

    @Override
    public ListenableFuture<SendResult<String, OfferedElectrifiedParkingSpaceWithdrawed>> sendElectrifiedParkingSpaceWithdrawedEvent(OfferedElectrifiedParkingSpaceWithdrawed offeredElectrifiedParkingSpaceWithdrawed) {
        return electrifiedParkingSpaceWithdrawedEventsProducer.send(electrifiedParkingSpaceWithdrawedEventsTopic, offeredElectrifiedParkingSpaceWithdrawed);
    }
}
