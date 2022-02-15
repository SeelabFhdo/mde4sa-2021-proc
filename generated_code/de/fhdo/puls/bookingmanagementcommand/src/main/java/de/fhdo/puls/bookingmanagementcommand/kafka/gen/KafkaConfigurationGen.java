package de.fhdo.puls.bookingmanagementcommand.kafka.gen;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkAndChargeBookingCanceled;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkAndChargeBookingCreated;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkAndChargeBookingUpdated;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkBookingCanceled;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkBookingCreated;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkBookingUpdated;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

public interface KafkaConfigurationGen {

    KafkaAdmin kafkaAdmin();

    ProducerFactory<String, ParkBookingCreated> parkBookingCreatedEventProducerFactory();

    KafkaTemplate<String, ParkBookingCreated> parkBookingCreatedEventProducer();

    ProducerFactory<String, ParkBookingUpdated> parkBookingUpdatedEventProducerFactory();

    KafkaTemplate<String, ParkBookingUpdated> parkBookingUpdatedEventProducer();

    ProducerFactory<String, ParkBookingCanceled> parkBookingCanceledEventProducerFactory();

    KafkaTemplate<String, ParkBookingCanceled> parkBookingCanceledEventProducer();

    ProducerFactory<String, ParkAndChargeBookingCreated> parkAndChargeBookingCreatedEventProducerFactory();

    KafkaTemplate<String, ParkAndChargeBookingCreated> parkAndChargeBookingCreatedEventProducer();

    ProducerFactory<String, ParkAndChargeBookingUpdated> parkAndChargeBookingUpdatedEventProducerFactory();

    KafkaTemplate<String, ParkAndChargeBookingUpdated> parkAndChargeBookingUpdatedEventProducer();

    ProducerFactory<String, ParkAndChargeBookingCanceled> parkAndChargeBookingCanceledEventProducerFactory();

    KafkaTemplate<String, ParkAndChargeBookingCanceled> parkAndChargeBookingCanceledEventProducer();
}
