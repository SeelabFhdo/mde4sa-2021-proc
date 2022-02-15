package de.fhdo.puls.chargingstationmanagementcommand.kafka.gen;

import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.ElectrifiedParkingSpaceCreated;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.ParkingSpaceCreated;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

public interface KafkaConfigurationGen {

    KafkaAdmin kafkaAdmin();

    ProducerFactory<String, ParkingSpaceCreated> parkingSpaceCreatedEventsProducerFactory();

    KafkaTemplate<String, ParkingSpaceCreated> parkingSpaceCreatedEventsProducer();

    ProducerFactory<String, ElectrifiedParkingSpaceCreated> electrifiedParkingSpaceCreatedEventsProducerFactory();

    KafkaTemplate<String, ElectrifiedParkingSpaceCreated> electrifiedParkingSpaceCreatedEventsProducer();
}
