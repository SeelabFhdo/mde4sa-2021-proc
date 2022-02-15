package de.fhdo.puls.bookingmanagementcommand.kafka.gen;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkAndChargeBookingCanceled;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkAndChargeBookingCreated;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkAndChargeBookingUpdated;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkBookingCanceled;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkBookingCreated;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkBookingUpdated;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;

public interface BookingProducerServiceGen {

    void setParkBookingCreatedEventProducer(KafkaTemplate<String, ParkBookingCreated> parkBookingCreatedEventProducer);

    ListenableFuture<SendResult<String, ParkBookingCreated>> sendParkBookingCreatedEvent(ParkBookingCreated parkBookingCreated);

    void setParkBookingUpdatedEventProducer(KafkaTemplate<String, ParkBookingUpdated> parkBookingUpdatedEventProducer);

    ListenableFuture<SendResult<String, ParkBookingUpdated>> sendParkBookingUpdatedEvent(ParkBookingUpdated parkBookingUpdated);

    void setParkBookingCanceledEventProducer(KafkaTemplate<String, ParkBookingCanceled> parkBookingCanceledEventProducer);

    ListenableFuture<SendResult<String, ParkBookingCanceled>> sendParkBookingCanceledEvent(ParkBookingCanceled parkBookingCanceled);

    void setParkAndChargeBookingCreatedEventProducer(KafkaTemplate<String, ParkAndChargeBookingCreated> parkAndChargeBookingCreatedEventProducer);

    ListenableFuture<SendResult<String, ParkAndChargeBookingCreated>> sendParkAndChargeBookingCreatedEvent(ParkAndChargeBookingCreated parkAndChargeBookingCreated);

    void setParkAndChargeBookingUpdatedEventProducer(KafkaTemplate<String, ParkAndChargeBookingUpdated> parkAndChargeBookingUpdatedEventProducer);

    ListenableFuture<SendResult<String, ParkAndChargeBookingUpdated>> sendParkAndChargeBookingUpdatedEvent(ParkAndChargeBookingUpdated parkAndChargeBookingUpdated);

    void setParkAndChargeBookingCanceledEventProducer(KafkaTemplate<String, ParkAndChargeBookingCanceled> parkAndChargeBookingCanceledEventProducer);

    ListenableFuture<SendResult<String, ParkAndChargeBookingCanceled>> sendParkAndChargeBookingCanceledEvent(ParkAndChargeBookingCanceled parkAndChargeBookingCanceled);
}
