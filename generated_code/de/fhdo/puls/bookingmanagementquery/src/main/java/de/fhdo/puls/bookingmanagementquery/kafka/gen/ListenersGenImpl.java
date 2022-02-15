package de.fhdo.puls.bookingmanagementquery.kafka.gen;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ElectrifiedParkingSpaceOffered;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.OfferedElectrifiedParkingSpaceWithdrawed;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.OfferedParkingSpaceWithdrawed;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkAndChargeBookingCanceled;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkAndChargeBookingCreated;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkAndChargeBookingUpdated;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkBookingCanceled;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkBookingCreated;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkBookingUpdated;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkingSpaceOffered;
import de.fhdo.puls.bookingmanagementquery.domain.ParkBookingQueryApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;

public abstract class ListenersGenImpl implements ListenersGen {

    protected ParkBookingQueryApiService parkBookingQueryApiService;

    @Autowired()
    @Override
    public void setParkBookingQueryApiService(ParkBookingQueryApiService parkBookingQueryApiService) {
        this.parkBookingQueryApiService = parkBookingQueryApiService;
    }

    @KafkaListener(topics = "${kafka.topic.parkBookingCreatedEvents}", groupId = "${kafka.group.parkBookingCreatedEvents}", containerFactory = "parkBookingCreatedEventsParkBookingCreatedEventsKafkaListenerContainerFactory", errorHandler = "receiveParkBookingCreatedEventsErrorHandler")
    @Override
    public void receiveParkBookingCreatedEventsListener(ParkBookingCreated parkBookingCreated) {
        parkBookingQueryApiService.receiveParkBookingCreatedEvents(parkBookingCreated);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveParkBookingCreatedEventsErrorHandler() {
        return (message, exception, consumer) -> parkBookingQueryApiService.receiveParkBookingCreatedEventsErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.parkBookingUpdatedEvents}", groupId = "${kafka.group.parkBookingUpdatedEvents}", containerFactory = "parkBookingUpdatedEventsParkBookingUpdatedEventsKafkaListenerContainerFactory", errorHandler = "receiveParkBookingUpdatedEventsErrorHandler")
    @Override
    public void receiveParkBookingUpdatedEventsListener(ParkBookingUpdated parkBookingUpdated) {
        parkBookingQueryApiService.receiveParkBookingUpdatedEvents(parkBookingUpdated);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveParkBookingUpdatedEventsErrorHandler() {
        return (message, exception, consumer) -> parkBookingQueryApiService.receiveParkBookingUpdatedEventsErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.parkBookingCanceledEvents}", groupId = "${kafka.group.parkCanceledDeletedEvents}", containerFactory = "parkBookingCanceledEventsParkCanceledDeletedEventsKafkaListenerContainerFactory", errorHandler = "receiveParkBookingDeletedEventsErrorHandler")
    @Override
    public void receiveParkBookingDeletedEventsListener(ParkBookingCanceled parkBookingCanceled) {
        parkBookingQueryApiService.receiveParkBookingDeletedEvents(parkBookingCanceled);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveParkBookingDeletedEventsErrorHandler() {
        return (message, exception, consumer) -> parkBookingQueryApiService.receiveParkBookingDeletedEventsErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.parkingSpaceOfferedEvents}", groupId = "${kafka.group.parkingSpaceOfferedEvents}", containerFactory = "parkingSpaceOfferedEventsParkingSpaceOfferedEventsKafkaListenerContainerFactory", errorHandler = "receiveParkingSpaceOfferedEventsErrorHandler")
    @Override
    public void receiveParkingSpaceOfferedEventsListener(ParkingSpaceOffered parkingSpaceOffered) {
        parkBookingQueryApiService.receiveParkingSpaceOfferedEvents(parkingSpaceOffered);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveParkingSpaceOfferedEventsErrorHandler() {
        return (message, exception, consumer) -> parkBookingQueryApiService.receiveParkingSpaceOfferedEventsErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.parkingSpaceWithdrawedEvents}", groupId = "${kafka.group.parkingSpaceWithdrawedEvents}", containerFactory = "parkingSpaceWithdrawedEventsParkingSpaceWithdrawedEventsKafkaListenerContainerFactory", errorHandler = "receiveParkingSpaceWithdrawedEventsErrorHandler")
    @Override
    public void receiveParkingSpaceWithdrawedEventsListener(OfferedParkingSpaceWithdrawed offeredParkingSpaceWithdrawed) {
        parkBookingQueryApiService.receiveParkingSpaceWithdrawedEvents(offeredParkingSpaceWithdrawed);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveParkingSpaceWithdrawedEventsErrorHandler() {
        return (message, exception, consumer) -> parkBookingQueryApiService.receiveParkingSpaceWithdrawedEventsErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.parkAndChargeBookingCreatedEvents}", groupId = "${kafka.group.parkAndChargeCreatedEvents}", containerFactory = "parkAndChargeBookingCreatedEventsParkAndChargeCreatedEventsKafkaListenerContainerFactory", errorHandler = "receiveParkBookingCreatedEventsErrorHandler")
    @Override
    public void receiveParkBookingCreatedEventsListener(ParkAndChargeBookingCreated parkAndChargeBookingCreated) {
        parkBookingQueryApiService.receiveParkBookingCreatedEvents(parkAndChargeBookingCreated);
    }

    @KafkaListener(topics = "${kafka.topic.parkAndChargeBookingUpdatedEvents}", groupId = "${kafka.group.parkAndChargeBookingUpdatedEvents}", containerFactory = "parkAndChargeBookingUpdatedEventsParkAndChargeBookingUpdatedEventsKafkaListenerContainerFactory", errorHandler = "receiveParkBookingUpdatedEventsErrorHandler")
    @Override
    public void receiveParkBookingUpdatedEventsListener(ParkAndChargeBookingUpdated parkAndChargeBookingUpdated) {
        parkBookingQueryApiService.receiveParkBookingUpdatedEvents(parkAndChargeBookingUpdated);
    }

    @KafkaListener(topics = "${kafka.topic.parkAndChargeBookingCanceledEvents}", groupId = "${kafka.group.parkAndChargeCanceledDeletedEvents}", containerFactory = "parkAndChargeBookingCanceledEventsParkAndChargeCanceledDeletedEventsKafkaListenerContainerFactory", errorHandler = "receiveParkBookingDeletedEventsErrorHandler")
    @Override
    public void receiveParkBookingDeletedEventsListener(ParkAndChargeBookingCanceled parkAndChargeBookingCanceled) {
        parkBookingQueryApiService.receiveParkBookingDeletedEvents(parkAndChargeBookingCanceled);
    }

    @KafkaListener(topics = "${kafka.topic.electrifiedParkingSpaceOfferedEvents}", groupId = "${kafka.group.electrifiedParkingSpaceOfferedEvents}", containerFactory = "electrifiedParkingSpaceOfferedEventsElectrifiedParkingSpaceOfferedEventsKafkaListenerContainerFactory", errorHandler = "receiveElectrifiedParkingSpaceOfferedEventsErrorHandler")
    @Override
    public void receiveElectrifiedParkingSpaceOfferedEventsListener(ElectrifiedParkingSpaceOffered electrifiedParkingSpaceOffered) {
        parkBookingQueryApiService.receiveElectrifiedParkingSpaceOfferedEvents(electrifiedParkingSpaceOffered);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveElectrifiedParkingSpaceOfferedEventsErrorHandler() {
        return (message, exception, consumer) -> parkBookingQueryApiService.receiveElectrifiedParkingSpaceOfferedEventsErrorHandler(message, exception, consumer);
    }

    @KafkaListener(topics = "${kafka.topic.electrifiedParkingSpaceWithdrawedEvents}", groupId = "${kafka.group.electrifiedParkingSpaceWithdrawedEvents}", containerFactory = "electrifiedParkingSpaceWithdrawedEventsElectrifiedParkingSpaceWithdrawedEventsKafkaListenerContainerFactory", errorHandler = "receiveElectrifiedParkingSpaceWithdrawedEventsErrorHandler")
    @Override
    public void receiveElectrifiedParkingSpaceWithdrawedEventsListener(OfferedElectrifiedParkingSpaceWithdrawed offeredElectrifiedParkingSpaceWithdrawed) {
        parkBookingQueryApiService.receiveElectrifiedParkingSpaceWithdrawedEvents(offeredElectrifiedParkingSpaceWithdrawed);
    }

    @Bean()
    @Override
    public ConsumerAwareListenerErrorHandler receiveElectrifiedParkingSpaceWithdrawedEventsErrorHandler() {
        return (message, exception, consumer) -> parkBookingQueryApiService.receiveElectrifiedParkingSpaceWithdrawedEventsErrorHandler(message, exception, consumer);
    }
}
