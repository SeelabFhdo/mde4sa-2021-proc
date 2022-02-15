package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkAndChargeBooking;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen.ParkAndChargeBookingRepositoryGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkAndChargeBookingRepositoryGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkAndChargeBookingRepository extends ParkAndChargeBookingRepositoryGenImpl {

    public ParkAndChargeBookingRepository() {
        super();
    }

    public ParkAndChargeBookingRepository(long bookingId, ParkAndChargeBooking parkBookingAggregate) {
        super(bookingId, parkBookingAggregate);
    }
}
