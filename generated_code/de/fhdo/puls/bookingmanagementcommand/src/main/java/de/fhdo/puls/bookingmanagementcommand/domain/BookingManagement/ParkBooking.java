package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkingSpace;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.TimeSlot;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen.ParkBookingGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkBookingGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkBooking extends ParkBookingGenImpl {

    public ParkBooking() {
        super();
    }

    public ParkBooking(long bookingId, Booker booker, ParkingSpace parkingSpace, TimeSlot bookinTimeSlot, float bookingPriceTotal, boolean isCanceled) {
        super(bookingId, booker, parkingSpace, bookinTimeSlot, bookingPriceTotal, isCanceled);
    }
}
