package de.fhdo.puls.chargingstationmanagementquery.kafka.gen;

import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ElectrifiedParkingSpaceCreated;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ParkingSpaceCreated;
import de.fhdo.puls.chargingstationmanagementquery.domain.ParkingSpaceQueriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;

public abstract class ListenersGenImpl implements ListenersGen {

    protected ParkingSpaceQueriesService parkingSpaceQueriesService;

    @Autowired()
    @Override
    public void setParkingSpaceQueriesService(ParkingSpaceQueriesService parkingSpaceQueriesService) {
        this.parkingSpaceQueriesService = parkingSpaceQueriesService;
    }

    @KafkaListener(topics = "${kafka.topic.parkingSpaceCreatedEvents}", groupId = "${kafka.group.parkingSpaceCreatedEvents}", containerFactory = "parkingSpaceCreatedEventsParkingSpaceCreatedEventsKafkaListenerContainerFactory", errorHandler = "receiveParkingSpaceCreatedEventsErrorHandler")
    @Override
    public void receiveParkingSpaceCreatedEventsListener(ParkingSpaceCreated parkingSpaceCreated) {
        parkingSpaceQueriesService.receiveParkingSpaceCreatedEvents(parkingSpaceCreated);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveParkingSpaceCreatedEventsErrorHandler() {
        return (message, exception, consumer) -> parkingSpaceQueriesService.receiveParkingSpaceCreatedEventsErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.ElectrifiedParkingSpaceCreatedEvents}", groupId = "${kafka.group.ElectrifiedParkingSpaceCreatedEvents}", containerFactory = "electrifiedParkingSpaceCreatedEventsElectrifiedParkingSpaceCreatedEventsKafkaListenerContainerFactory", errorHandler = "receiveElectrifiedParkingSpaceCreatedEventsErrorHandler")
    @Override
    public void receiveElectrifiedParkingSpaceCreatedEventsListener(ElectrifiedParkingSpaceCreated electrifiedParkingSpaceCreated) {
        parkingSpaceQueriesService.receiveElectrifiedParkingSpaceCreatedEvents(electrifiedParkingSpaceCreated);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveElectrifiedParkingSpaceCreatedEventsErrorHandler() {
        return (message, exception, consumer) -> parkingSpaceQueriesService.receiveElectrifiedParkingSpaceCreatedEventsErrorHandler(message, exception, consumer);
    }
}
