package de.fhdo.puls.bookingmanagementquery.domain;

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
import de.fhdo.puls.bookingmanagementquery.domain.gen.ParkBookingQueryApiServiceGenImpl;
import org.apache.kafka.clients.consumer.Consumer;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkBookingQueryApiServiceGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Service()
public class ParkBookingQueryApiService extends ParkBookingQueryApiServiceGenImpl {

    public void receiveParkBookingCreatedEvents(ParkBookingCreated parkBookingCreated) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveParkBookingCreatedEventsErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveParkBookingUpdatedEvents(ParkBookingUpdated parkBookingUpdated) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveParkBookingUpdatedEventsErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveParkBookingDeletedEvents(ParkBookingCanceled parkBookingCanceled) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveParkBookingDeletedEventsErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveParkingSpaceOfferedEvents(ParkingSpaceOffered parkingSpaceOffered) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveParkingSpaceOfferedEventsErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveParkingSpaceWithdrawedEvents(OfferedParkingSpaceWithdrawed offeredParkingSpaceWithdrawed) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveParkingSpaceWithdrawedEventsErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveParkBookingCreatedEvents(ParkAndChargeBookingCreated parkAndChargeBookingCreated) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveParkBookingUpdatedEvents(ParkAndChargeBookingUpdated parkAndChargeBookingUpdated) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveParkBookingDeletedEvents(ParkAndChargeBookingCanceled parkAndChargeBookingCanceled) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveElectrifiedParkingSpaceOfferedEvents(ElectrifiedParkingSpaceOffered electrifiedParkingSpaceOffered) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveElectrifiedParkingSpaceOfferedEventsErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void receiveElectrifiedParkingSpaceWithdrawedEvents(OfferedElectrifiedParkingSpaceWithdrawed offeredElectrifiedParkingSpaceWithdrawed) {
        // TODO: Implement handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Object receiveElectrifiedParkingSpaceWithdrawedEventsErrorHandler(Message<?> message, ListenerExecutionFailedException listenerExecutionFailedException, Consumer<?, ?> consumer) {
        // TODO: Implement error handler
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public ParkBookingQueryApiService() {
    }
}
