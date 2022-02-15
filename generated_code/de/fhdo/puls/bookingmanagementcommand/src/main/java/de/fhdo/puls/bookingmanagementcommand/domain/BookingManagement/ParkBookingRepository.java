package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkBooking;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen.ParkBookingRepositoryGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkBookingRepositoryGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkBookingRepository extends ParkBookingRepositoryGenImpl {

    public ParkBookingRepository() {
        super();
    }

    public ParkBookingRepository(long bookingId, ParkBooking parkBookingAggregate) {
        super(bookingId, parkBookingAggregate);
    }
}
