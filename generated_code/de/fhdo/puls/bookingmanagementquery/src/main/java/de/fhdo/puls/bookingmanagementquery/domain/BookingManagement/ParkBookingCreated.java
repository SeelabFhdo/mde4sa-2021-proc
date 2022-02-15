package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkingSpace;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.TimeSlot;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen.ParkBookingCreatedGenImpl;
import java.util.Date;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkBookingCreatedGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkBookingCreated extends ParkBookingCreatedGenImpl {

    public ParkBookingCreated() {
        super();
    }

    public ParkBookingCreated(long bookingId, Booker booker, ParkingSpace parkingSpace, TimeSlot timeSlot, Date bookingCreatedDate, Date lastModifiedDate, float bookingPricePerHour, float bookingPriceTotal) {
        super(bookingId, booker, parkingSpace, timeSlot, bookingCreatedDate, lastModifiedDate, bookingPricePerHour, bookingPriceTotal);
    }
}
