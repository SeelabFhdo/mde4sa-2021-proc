package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen.ParkAndChargeBookingCanceledGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkAndChargeBookingCanceledGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkAndChargeBookingCanceled extends ParkAndChargeBookingCanceledGenImpl {

    public ParkAndChargeBookingCanceled() {
        super();
    }

    public ParkAndChargeBookingCanceled(long bookingId, boolean bookingCanceled) {
        super(bookingId, bookingCanceled);
    }
}
