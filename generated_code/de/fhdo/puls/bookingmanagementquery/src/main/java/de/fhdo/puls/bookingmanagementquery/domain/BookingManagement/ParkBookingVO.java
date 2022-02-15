package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkingSpace;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.TimeSlot;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen.ParkBookingVOGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkBookingVOGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkBookingVO extends ParkBookingVOGenImpl {

    public ParkBookingVO() {
        super();
    }

    public ParkBookingVO(long bookingId, Booker booker, ParkingSpace parkingSpace, TimeSlot timeSlot, float bookingPriceTotal, boolean bookingCanceled) {
        super(bookingId, booker, parkingSpace, timeSlot, bookingPriceTotal, bookingCanceled);
    }
}
