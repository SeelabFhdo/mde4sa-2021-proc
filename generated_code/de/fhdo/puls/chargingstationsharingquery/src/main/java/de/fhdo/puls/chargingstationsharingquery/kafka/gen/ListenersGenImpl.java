package de.fhdo.puls.chargingstationsharingquery.kafka.gen;

import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.ElectrifiedParkingSpaceOffered;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.OfferedElectrifiedParkingSpaceWithdrawed;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.OfferedParkingSpaceWithdrawed;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.ParkingSpaceOffered;
import de.fhdo.puls.chargingstationsharingquery.domain.ParkingSpaceSharingQueriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;

public abstract class ListenersGenImpl implements ListenersGen {

    protected ParkingSpaceSharingQueriesService parkingSpaceSharingQueriesService;

    @Autowired()
    @Override
    public void setParkingSpaceSharingQueriesService(ParkingSpaceSharingQueriesService parkingSpaceSharingQueriesService) {
        this.parkingSpaceSharingQueriesService = parkingSpaceSharingQueriesService;
    }

    @KafkaListener(topics = "${kafka.topic.parkingSpaceOfferedEvents}", groupId = "${kafka.group.parkingSpaceOfferedEvents}", containerFactory = "parkingSpaceOfferedEventsParkingSpaceOfferedEventsKafkaListenerContainerFactory", errorHandler = "receiveParkingSpaceOfferedEventsErrorHandler")
    @Override
    public void receiveParkingSpaceOfferedEventsListener(ParkingSpaceOffered parkingSpaceOffered) {
        parkingSpaceSharingQueriesService.receiveParkingSpaceOfferedEvents(parkingSpaceOffered);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveParkingSpaceOfferedEventsErrorHandler() {
        return (message, exception, consumer) -> parkingSpaceSharingQueriesService.receiveParkingSpaceOfferedEventsErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.parkingSpaceWithdrawedEvents}", groupId = "${kafka.group.parkingSpaceWithdrawedEvents}", containerFactory = "parkingSpaceWithdrawedEventsParkingSpaceWithdrawedEventsKafkaListenerContainerFactory", errorHandler = "receiveParkingSpaceWithdrawedEventsErrorHandler")
    @Override
    public void receiveParkingSpaceWithdrawedEventsListener(OfferedParkingSpaceWithdrawed offeredParkingSpaceWithdrawed) {
        parkingSpaceSharingQueriesService.receiveParkingSpaceWithdrawedEvents(offeredParkingSpaceWithdrawed);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveParkingSpaceWithdrawedEventsErrorHandler() {
        return (message, exception, consumer) -> parkingSpaceSharingQueriesService.receiveParkingSpaceWithdrawedEventsErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.electrifiedParkingSpaceOfferedEvents}", groupId = "${kafka.group.electrifiedParkingSpaceOfferedEvents}", containerFactory = "electrifiedParkingSpaceOfferedEventsElectrifiedParkingSpaceOfferedEventsKafkaListenerContainerFactory", errorHandler = "receiveElectrifiedParkingSpaceOfferedEventsErrorHandler")
    @Override
    public void receiveElectrifiedParkingSpaceOfferedEventsListener(ElectrifiedParkingSpaceOffered electrifiedParkingSpaceOffered) {
        parkingSpaceSharingQueriesService.receiveElectrifiedParkingSpaceOfferedEvents(electrifiedParkingSpaceOffered);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveElectrifiedParkingSpaceOfferedEventsErrorHandler() {
        return (message, exception, consumer) -> parkingSpaceSharingQueriesService.receiveElectrifiedParkingSpaceOfferedEventsErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.electrifiedParkingSpaceWithdrawedEvents}", groupId = "${kafka.group.electrifiedParkingSpaceWithdrawedEvents}", containerFactory = "electrifiedParkingSpaceWithdrawedEventsElectrifiedParkingSpaceWithdrawedEventsKafkaListenerContainerFactory", errorHandler = "receiveElectrifiedParkingSpaceWithdrawedEventsErrorHandler")
    @Override
    public void receiveElectrifiedParkingSpaceWithdrawedEventsListener(OfferedElectrifiedParkingSpaceWithdrawed offeredElectrifiedParkingSpaceWithdrawed) {
        parkingSpaceSharingQueriesService.receiveElectrifiedParkingSpaceWithdrawedEvents(offeredElectrifiedParkingSpaceWithdrawed);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveElectrifiedParkingSpaceWithdrawedEventsErrorHandler() {
        return (message, exception, consumer) -> parkingSpaceSharingQueriesService.receiveElectrifiedParkingSpaceWithdrawedEventsErrorHandler(message, exception, consumer);
    }
}
