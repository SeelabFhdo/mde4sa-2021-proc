package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.TimeSlot;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen.UpdateParkAndChargeBookingCommandGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends UpdateParkAndChargeBookingCommandGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class UpdateParkAndChargeBookingCommand extends UpdateParkAndChargeBookingCommandGenImpl {

    public UpdateParkAndChargeBookingCommand() {
        super();
    }

    public UpdateParkAndChargeBookingCommand(long bookingId, TimeSlot timeSlot, float bookingPriceTotal) {
        super(bookingId, timeSlot, bookingPriceTotal);
    }
}
