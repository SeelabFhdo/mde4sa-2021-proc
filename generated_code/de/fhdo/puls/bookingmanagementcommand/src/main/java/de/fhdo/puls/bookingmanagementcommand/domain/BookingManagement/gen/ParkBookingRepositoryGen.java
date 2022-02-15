package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkBooking;

public interface ParkBookingRepositoryGen {

    long getBookingId();

    void setBookingId(long bookingId);

    ParkBooking getParkBookingAggregate();

    void setParkBookingAggregate(ParkBooking parkBookingAggregate);
}
