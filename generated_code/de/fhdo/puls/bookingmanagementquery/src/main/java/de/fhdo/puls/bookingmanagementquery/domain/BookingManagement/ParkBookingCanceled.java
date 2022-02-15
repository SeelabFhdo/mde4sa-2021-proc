package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen.ParkBookingCanceledGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkBookingCanceledGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkBookingCanceled extends ParkBookingCanceledGenImpl {

    public ParkBookingCanceled() {
        super();
    }

    public ParkBookingCanceled(long bookingId, boolean bookingCanceled) {
        super(bookingId, bookingCanceled);
    }
}
