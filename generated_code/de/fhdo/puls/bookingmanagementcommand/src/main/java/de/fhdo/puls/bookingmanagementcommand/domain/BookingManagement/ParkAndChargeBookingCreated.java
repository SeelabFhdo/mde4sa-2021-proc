package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkingSpace;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.TimeSlot;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen.ParkAndChargeBookingCreatedGenImpl;
import java.util.Date;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkAndChargeBookingCreatedGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkAndChargeBookingCreated extends ParkAndChargeBookingCreatedGenImpl {

    public ParkAndChargeBookingCreated() {
        super();
    }

    public ParkAndChargeBookingCreated(long bookingId, Booker booker, ParkingSpace parkingSpace, TimeSlot timeSlot, Date bookingCreatedDate, Date lastModifiedDate, float bookingPricePerHour, float bookingPriceTotal, int verifycode) {
        super(bookingId, booker, parkingSpace, timeSlot, bookingCreatedDate, lastModifiedDate, bookingPricePerHour, bookingPriceTotal, verifycode);
    }
}
