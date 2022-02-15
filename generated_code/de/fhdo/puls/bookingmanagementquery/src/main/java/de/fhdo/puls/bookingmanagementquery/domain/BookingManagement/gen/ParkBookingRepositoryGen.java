package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkBooking;

public interface ParkBookingRepositoryGen {

    long getBookingId();

    void setBookingId(long bookingId);

    ParkBooking getParkBookingAggregate();

    void setParkBookingAggregate(ParkBooking parkBookingAggregate);
}
