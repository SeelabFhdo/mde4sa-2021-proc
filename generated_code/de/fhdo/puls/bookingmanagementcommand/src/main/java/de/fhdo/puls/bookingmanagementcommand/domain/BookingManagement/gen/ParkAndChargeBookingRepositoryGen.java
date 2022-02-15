package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkAndChargeBooking;

public interface ParkAndChargeBookingRepositoryGen {

    long getBookingId();

    void setBookingId(long bookingId);

    ParkAndChargeBooking getParkBookingAggregate();

    void setParkBookingAggregate(ParkAndChargeBooking parkBookingAggregate);
}
