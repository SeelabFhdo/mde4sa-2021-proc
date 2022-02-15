package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.TimeSlot;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen.ParkAndChargeBookingUpdatedGenImpl;
import java.util.Date;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkAndChargeBookingUpdatedGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkAndChargeBookingUpdated extends ParkAndChargeBookingUpdatedGenImpl {

    public ParkAndChargeBookingUpdated() {
        super();
    }

    public ParkAndChargeBookingUpdated(long bookingId, Date bookingCreatedDate, Date lastModifiedDate, TimeSlot timeSlot, float bookingPriceTotal) {
        super(bookingId, bookingCreatedDate, lastModifiedDate, timeSlot, bookingPriceTotal);
    }
}
