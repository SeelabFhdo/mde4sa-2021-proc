package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkingSpace;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.TimeSlot;
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
