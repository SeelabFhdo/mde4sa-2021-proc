package de.fhdo.puls.chargingstationsearchmanagement.kafka.gen;

import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.ElectrifiedParkingSpaceOffered;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.OfferedElectrifiedParkingSpaceWithdrawed;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.OfferedParkingSpaceWithdrawed;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.ParkingSpaceOffered;
import de.fhdo.puls.chargingstationsearchmanagement.domain.MapSearchControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;

public abstract class ListenersGenImpl implements ListenersGen {

    protected MapSearchControllerService mapSearchControllerService;

    @Autowired()
    @Override
    public void setMapSearchControllerService(MapSearchControllerService mapSearchControllerService) {
        this.mapSearchControllerService = mapSearchControllerService;
    }

    @KafkaListener(topics = "${kafka.topic.parkingSpaceOfferedEvents}", groupId = "${kafka.group.parkingSpaceOfferedEvents}", containerFactory = "parkingSpaceOfferedEventsParkingSpaceOfferedEventsKafkaListenerContainerFactory", errorHandler = "receiveParkingSpaceOfferedEventsErrorHandler")
    @Override
    public void receiveParkingSpaceOfferedEventsListener(ParkingSpaceOffered parkingSpaceOffered) {
        mapSearchControllerService.receiveParkingSpaceOfferedEvents(parkingSpaceOffered);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveParkingSpaceOfferedEventsErrorHandler() {
        return (message, exception, consumer) -> mapSearchControllerService.receiveParkingSpaceOfferedEventsErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.parkingSpaceWithdrawedEvents}", groupId = "${kafka.group.parkingSpaceWithdrawedEvents}", containerFactory = "parkingSpaceWithdrawedEventsParkingSpaceWithdrawedEventsKafkaListenerContainerFactory", errorHandler = "receiveParkingSpaceWithdrawedEventsErrorHandler")
    @Override
    public void receiveParkingSpaceWithdrawedEventsListener(OfferedParkingSpaceWithdrawed offeredParkingSpaceWithdrawed) {
        mapSearchControllerService.receiveParkingSpaceWithdrawedEvents(offeredParkingSpaceWithdrawed);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveParkingSpaceWithdrawedEventsErrorHandler() {
        return (message, exception, consumer) -> mapSearchControllerService.receiveParkingSpaceWithdrawedEventsErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.electrifiedParkingSpaceOfferedEvents}", groupId = "${kafka.group.electrifiedParkingSpaceOfferedEvents}", containerFactory = "electrifiedParkingSpaceOfferedEventsElectrifiedParkingSpaceOfferedEventsKafkaListenerContainerFactory", errorHandler = "receiveElectrifiedParkingSpaceOfferedEventsErrorHandler")
    @Override
    public void receiveElectrifiedParkingSpaceOfferedEventsListener(ElectrifiedParkingSpaceOffered electrifiedParkingSpaceOffered) {
        mapSearchControllerService.receiveElectrifiedParkingSpaceOfferedEvents(electrifiedParkingSpaceOffered);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveElectrifiedParkingSpaceOfferedEventsErrorHandler() {
        return (message, exception, consumer) -> mapSearchControllerService.receiveElectrifiedParkingSpaceOfferedEventsErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.electrifiedParkingSpaceWithdrawedEvents}", groupId = "${kafka.group.electrifiedParkingSpaceWithdrawedEvents}", containerFactory = "electrifiedParkingSpaceWithdrawedEventsElectrifiedParkingSpaceWithdrawedEventsKafkaListenerContainerFactory", errorHandler = "receiveElectrifiedParkingSpaceWithdrawedEventsErrorHandler")
    @Override
    public void receiveElectrifiedParkingSpaceWithdrawedEventsListener(OfferedElectrifiedParkingSpaceWithdrawed offeredElectrifiedParkingSpaceWithdrawed) {
        mapSearchControllerService.receiveElectrifiedParkingSpaceWithdrawedEvents(offeredElectrifiedParkingSpaceWithdrawed);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveElectrifiedParkingSpaceWithdrawedEventsErrorHandler() {
        return (message, exception, consumer) -> mapSearchControllerService.receiveElectrifiedParkingSpaceWithdrawedEventsErrorHandler(message, exception, consumer);
    }
}
