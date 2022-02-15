package de.fhdo.puls.bookingmanagementcommand.kafka.gen;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkAndChargeBookingCanceled;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkAndChargeBookingCreated;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkAndChargeBookingUpdated;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkBookingCanceled;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkBookingCreated;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkBookingUpdated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;

public abstract class BookingProducerServiceGenImpl implements BookingProducerServiceGen {

    protected KafkaTemplate<String, ParkBookingCreated> parkBookingCreatedEventProducer;

    @Autowired()
    @Override
    public void setParkBookingCreatedEventProducer(KafkaTemplate<String, ParkBookingCreated> parkBookingCreatedEventProducer) {
        this.parkBookingCreatedEventProducer = parkBookingCreatedEventProducer;
    }

    @Value(value = "${kafka.topic.parkBookingCreatedEvent}")
    protected String parkBookingCreatedEventTopic;

    @Override
    public ListenableFuture<SendResult<String, ParkBookingCreated>> sendParkBookingCreatedEvent(ParkBookingCreated parkBookingCreated) {
        return parkBookingCreatedEventProducer.send(parkBookingCreatedEventTopic, parkBookingCreated);
    }

    protected KafkaTemplate<String, ParkBookingUpdated> parkBookingUpdatedEventProducer;

    @Autowired()
    @Override
    public void setParkBookingUpdatedEventProducer(KafkaTemplate<String, ParkBookingUpdated> parkBookingUpdatedEventProducer) {
        this.parkBookingUpdatedEventProducer = parkBookingUpdatedEventProducer;
    }

    @Value(value = "${kafka.topic.parkBookingUpdatedEvent}")
    protected String parkBookingUpdatedEventTopic;

    @Override
    public ListenableFuture<SendResult<String, ParkBookingUpdated>> sendParkBookingUpdatedEvent(ParkBookingUpdated parkBookingUpdated) {
        return parkBookingUpdatedEventProducer.send(parkBookingUpdatedEventTopic, parkBookingUpdated);
    }

    protected KafkaTemplate<String, ParkBookingCanceled> parkBookingCanceledEventProducer;

    @Autowired()
    @Override
    public void setParkBookingCanceledEventProducer(KafkaTemplate<String, ParkBookingCanceled> parkBookingCanceledEventProducer) {
        this.parkBookingCanceledEventProducer = parkBookingCanceledEventProducer;
    }

    @Value(value = "${kafka.topic.parkBookingCanceledEvent}")
    protected String parkBookingCanceledEventTopic;

    @Override
    public ListenableFuture<SendResult<String, ParkBookingCanceled>> sendParkBookingCanceledEvent(ParkBookingCanceled parkBookingCanceled) {
        return parkBookingCanceledEventProducer.send(parkBookingCanceledEventTopic, parkBookingCanceled);
    }

    protected KafkaTemplate<String, ParkAndChargeBookingCreated> parkAndChargeBookingCreatedEventProducer;

    @Autowired()
    @Override
    public void setParkAndChargeBookingCreatedEventProducer(KafkaTemplate<String, ParkAndChargeBookingCreated> parkAndChargeBookingCreatedEventProducer) {
        this.parkAndChargeBookingCreatedEventProducer = parkAndChargeBookingCreatedEventProducer;
    }

    @Value(value = "${kafka.topic.parkAndChargeBookingCreatedEvent}")
    protected String parkAndChargeBookingCreatedEventTopic;

    @Override
    public ListenableFuture<SendResult<String, ParkAndChargeBookingCreated>> sendParkAndChargeBookingCreatedEvent(ParkAndChargeBookingCreated parkAndChargeBookingCreated) {
        return parkAndChargeBookingCreatedEventProducer.send(parkAndChargeBookingCreatedEventTopic, parkAndChargeBookingCreated);
    }

    protected KafkaTemplate<String, ParkAndChargeBookingUpdated> parkAndChargeBookingUpdatedEventProducer;

    @Autowired()
    @Override
    public void setParkAndChargeBookingUpdatedEventProducer(KafkaTemplate<String, ParkAndChargeBookingUpdated> parkAndChargeBookingUpdatedEventProducer) {
        this.parkAndChargeBookingUpdatedEventProducer = parkAndChargeBookingUpdatedEventProducer;
    }

    @Value(value = "${kafka.topic.parkAndChargeBookingUpdatedEvent}")
    protected String parkAndChargeBookingUpdatedEventTopic;

    @Override
    public ListenableFuture<SendResult<String, ParkAndChargeBookingUpdated>> sendParkAndChargeBookingUpdatedEvent(ParkAndChargeBookingUpdated parkAndChargeBookingUpdated) {
        return parkAndChargeBookingUpdatedEventProducer.send(parkAndChargeBookingUpdatedEventTopic, parkAndChargeBookingUpdated);
    }

    protected KafkaTemplate<String, ParkAndChargeBookingCanceled> parkAndChargeBookingCanceledEventProducer;

    @Autowired()
    @Override
    public void setParkAndChargeBookingCanceledEventProducer(KafkaTemplate<String, ParkAndChargeBookingCanceled> parkAndChargeBookingCanceledEventProducer) {
        this.parkAndChargeBookingCanceledEventProducer = parkAndChargeBookingCanceledEventProducer;
    }

    @Value(value = "${kafka.topic.parkAndChargeBookingCanceledEvent}")
    protected String parkAndChargeBookingCanceledEventTopic;

    @Override
    public ListenableFuture<SendResult<String, ParkAndChargeBookingCanceled>> sendParkAndChargeBookingCanceledEvent(ParkAndChargeBookingCanceled parkAndChargeBookingCanceled) {
        return parkAndChargeBookingCanceledEventProducer.send(parkAndChargeBookingCanceledEventTopic, parkAndChargeBookingCanceled);
    }
}
