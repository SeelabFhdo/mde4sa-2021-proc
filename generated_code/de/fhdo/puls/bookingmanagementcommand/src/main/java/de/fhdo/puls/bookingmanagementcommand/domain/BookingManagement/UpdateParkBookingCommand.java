package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.TimeSlot;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen.UpdateParkBookingCommandGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends UpdateParkBookingCommandGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class UpdateParkBookingCommand extends UpdateParkBookingCommandGenImpl {

    public UpdateParkBookingCommand() {
        super();
    }

    public UpdateParkBookingCommand(long bookingId, TimeSlot timeSlot, float bookingPriceTotal) {
        super(bookingId, timeSlot, bookingPriceTotal);
    }
}
