package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ElectrifiedParkingSpace;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.TimeSlot;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen.ParkAndChargeBookingVOGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkAndChargeBookingVOGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkAndChargeBookingVO extends ParkAndChargeBookingVOGenImpl {

    public ParkAndChargeBookingVO() {
        super();
    }

    public ParkAndChargeBookingVO(long bookingId, Booker booker, ElectrifiedParkingSpace eParkingSpace, TimeSlot timeSlot, float bookingPriceTotal, int verifyCode, boolean bookingCanceled) {
        super(bookingId, booker, eParkingSpace, timeSlot, bookingPriceTotal, verifyCode, bookingCanceled);
    }
}
