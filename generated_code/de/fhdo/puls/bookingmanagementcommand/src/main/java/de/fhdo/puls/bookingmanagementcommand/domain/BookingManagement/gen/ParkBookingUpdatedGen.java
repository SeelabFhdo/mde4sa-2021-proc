package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.TimeSlot;
import java.util.Date;

public interface ParkBookingUpdatedGen {

    long getBookingId();

    Date getBookingCreatedDate();

    Date getLastModifiedDate();

    TimeSlot getTimeSlot();

    float getBookingPriceTotal();
}
