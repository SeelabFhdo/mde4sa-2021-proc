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
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;

public interface ListenersGen {

    void setParkBookingQueryApiService(ParkBookingQueryApiService parkBookingQueryApiService);

    void receiveParkBookingCreatedEventsListener(ParkBookingCreated parkBookingCreated);

    ConsumerAwareListenerErrorHandler receiveParkBookingCreatedEventsErrorHandler();

    void receiveParkBookingUpdatedEventsListener(ParkBookingUpdated parkBookingUpdated);

    ConsumerAwareListenerErrorHandler receiveParkBookingUpdatedEventsErrorHandler();

    void receiveParkBookingDeletedEventsListener(ParkBookingCanceled parkBookingCanceled);

    ConsumerAwareListenerErrorHandler receiveParkBookingDeletedEventsErrorHandler();

    void receiveParkingSpaceOfferedEventsListener(ParkingSpaceOffered parkingSpaceOffered);

    ConsumerAwareListenerErrorHandler receiveParkingSpaceOfferedEventsErrorHandler();

    void receiveParkingSpaceWithdrawedEventsListener(OfferedParkingSpaceWithdrawed offeredParkingSpaceWithdrawed);

    ConsumerAwareListenerErrorHandler receiveParkingSpaceWithdrawedEventsErrorHandler();

    void receiveParkBookingCreatedEventsListener(ParkAndChargeBookingCreated parkAndChargeBookingCreated);

    void receiveParkBookingUpdatedEventsListener(ParkAndChargeBookingUpdated parkAndChargeBookingUpdated);

    void receiveParkBookingDeletedEventsListener(ParkAndChargeBookingCanceled parkAndChargeBookingCanceled);

    void receiveElectrifiedParkingSpaceOfferedEventsListener(ElectrifiedParkingSpaceOffered electrifiedParkingSpaceOffered);

    ConsumerAwareListenerErrorHandler receiveElectrifiedParkingSpaceOfferedEventsErrorHandler();

    void receiveElectrifiedParkingSpaceWithdrawedEventsListener(OfferedElectrifiedParkingSpaceWithdrawed offeredElectrifiedParkingSpaceWithdrawed);

    ConsumerAwareListenerErrorHandler receiveElectrifiedParkingSpaceWithdrawedEventsErrorHandler();
}
