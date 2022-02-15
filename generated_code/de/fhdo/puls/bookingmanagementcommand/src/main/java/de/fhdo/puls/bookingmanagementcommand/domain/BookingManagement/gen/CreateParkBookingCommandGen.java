package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkingSpace;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.TimeSlot;

public interface CreateParkBookingCommandGen {

    Booker getBooker();

    ParkingSpace getParkingSpace();

    TimeSlot getTimeSlot();

    float getBookingPriceTotal();
}
