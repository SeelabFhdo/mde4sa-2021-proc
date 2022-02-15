package de.fhdo.puls.chargingstationmanagementquery.kafka.gen;

import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ElectrifiedParkingSpaceCreated;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ParkingSpaceCreated;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.KafkaAdmin;

public interface KafkaConfigurationGen {

    KafkaAdmin kafkaAdmin();

    ConsumerFactory<String, ParkingSpaceCreated> parkingSpaceCreatedEventsParkingSpaceCreatedEventsConsumerFactory();

    ConcurrentKafkaListenerContainerFactory<String, ParkingSpaceCreated> parkingSpaceCreatedEventsParkingSpaceCreatedEventsKafkaListenerContainerFactory();

    ConsumerFactory<String, ElectrifiedParkingSpaceCreated> electrifiedParkingSpaceCreatedEventsElectrifiedParkingSpaceCreatedEventsConsumerFactory();

    ConcurrentKafkaListenerContainerFactory<String, ElectrifiedParkingSpaceCreated> electrifiedParkingSpaceCreatedEventsElectrifiedParkingSpaceCreatedEventsKafkaListenerContainerFactory();
}
