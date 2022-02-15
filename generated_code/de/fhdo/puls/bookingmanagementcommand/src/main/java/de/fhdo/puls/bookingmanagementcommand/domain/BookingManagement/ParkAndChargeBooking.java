package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ElectrifiedParkingSpace;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.TimeSlot;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen.ParkAndChargeBookingGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkAndChargeBookingGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkAndChargeBooking extends ParkAndChargeBookingGenImpl {

    public ParkAndChargeBooking() {
        super();
    }

    public ParkAndChargeBooking(long bookingId, Booker booker, ElectrifiedParkingSpace electifiedParkingSpace, TimeSlot bookingTimeSlot, float bookingPriceTotal, boolean isCanceled, int verifyCode) {
        super(bookingId, booker, electifiedParkingSpace, bookingTimeSlot, bookingPriceTotal, isCanceled, verifyCode);
    }
}
