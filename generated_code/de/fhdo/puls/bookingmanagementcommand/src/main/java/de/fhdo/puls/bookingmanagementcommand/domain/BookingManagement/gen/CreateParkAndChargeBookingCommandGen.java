package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ElectrifiedParkingSpace;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.TimeSlot;

public interface CreateParkAndChargeBookingCommandGen {

    Booker getBooker();

    ElectrifiedParkingSpace getElectrifiedParkingSpace();

    TimeSlot getTimeSlot();

    float getBookingPriceTotal();
}
