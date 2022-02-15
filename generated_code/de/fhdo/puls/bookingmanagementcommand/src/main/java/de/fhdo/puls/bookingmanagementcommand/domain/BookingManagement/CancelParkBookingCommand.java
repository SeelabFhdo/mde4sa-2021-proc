package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen.CancelParkBookingCommandGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends CancelParkBookingCommandGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class CancelParkBookingCommand extends CancelParkBookingCommandGenImpl {

    public CancelParkBookingCommand() {
        super();
    }

    public CancelParkBookingCommand(long bookingId) {
        super(bookingId);
    }
}
