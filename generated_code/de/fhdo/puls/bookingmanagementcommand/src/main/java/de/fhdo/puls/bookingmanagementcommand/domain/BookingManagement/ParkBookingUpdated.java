package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.TimeSlot;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen.ParkBookingUpdatedGenImpl;
import java.util.Date;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkBookingUpdatedGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkBookingUpdated extends ParkBookingUpdatedGenImpl {

    public ParkBookingUpdated() {
        super();
    }

    public ParkBookingUpdated(long bookingId, Date bookingCreatedDate, Date lastModifiedDate, TimeSlot timeSlot, float bookingPriceTotal) {
        super(bookingId, bookingCreatedDate, lastModifiedDate, timeSlot, bookingPriceTotal);
    }
}
