package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen.TimeSlotGenImpl;
import java.util.Date;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends TimeSlotGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class TimeSlot extends TimeSlotGenImpl {

    public TimeSlot() {
        super();
    }

    public TimeSlot(Date startOfBooking, Date endOfBooking) {
        super(startOfBooking, endOfBooking);
    }
}
