package de.fhdo.puls.chargingstationsharingcommand.kafka.gen;

import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.ElectrifiedParkingSpaceOffered;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.OfferedElectrifiedParkingSpaceWithdrawed;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.OfferedParkingSpaceWithdrawed;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.ParkingSpaceOffered;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

public interface KafkaConfigurationGen {

    KafkaAdmin kafkaAdmin();

    ProducerFactory<String, ParkingSpaceOffered> parkingSpaceOfferedEventsProducerFactory();

    KafkaTemplate<String, ParkingSpaceOffered> parkingSpaceOfferedEventsProducer();

    ProducerFactory<String, OfferedParkingSpaceWithdrawed> parkingSpaceWithdrawedEventsProducerFactory();

    KafkaTemplate<String, OfferedParkingSpaceWithdrawed> parkingSpaceWithdrawedEventsProducer();

    ProducerFactory<String, ElectrifiedParkingSpaceOffered> electrifiedParkingSpaceOfferedEventsProducerFactory();

    KafkaTemplate<String, ElectrifiedParkingSpaceOffered> electrifiedParkingSpaceOfferedEventsProducer();

    ProducerFactory<String, OfferedElectrifiedParkingSpaceWithdrawed> electrifiedParkingSpaceWithdrawedEventsProducerFactory();

    KafkaTemplate<String, OfferedElectrifiedParkingSpaceWithdrawed> electrifiedParkingSpaceWithdrawedEventsProducer();
}
