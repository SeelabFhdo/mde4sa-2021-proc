package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkingSpace;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.TimeSlot;
import java.util.Date;

public interface ParkBookingCreatedGen {

    long getBookingId();

    Booker getBooker();

    ParkingSpace getParkingSpace();

    TimeSlot getTimeSlot();

    Date getBookingCreatedDate();

    Date getLastModifiedDate();

    float getBookingPricePerHour();

    float getBookingPriceTotal();
}
