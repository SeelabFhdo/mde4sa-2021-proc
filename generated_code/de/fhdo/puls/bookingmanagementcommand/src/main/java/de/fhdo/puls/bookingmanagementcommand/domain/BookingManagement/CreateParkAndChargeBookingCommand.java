package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ElectrifiedParkingSpace;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.TimeSlot;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen.CreateParkAndChargeBookingCommandGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends CreateParkAndChargeBookingCommandGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class CreateParkAndChargeBookingCommand extends CreateParkAndChargeBookingCommandGenImpl {

    public CreateParkAndChargeBookingCommand() {
        super();
    }

    public CreateParkAndChargeBookingCommand(Booker booker, ElectrifiedParkingSpace electrifiedParkingSpace, TimeSlot timeSlot, float bookingPriceTotal) {
        super(booker, electrifiedParkingSpace, timeSlot, bookingPriceTotal);
    }
}
