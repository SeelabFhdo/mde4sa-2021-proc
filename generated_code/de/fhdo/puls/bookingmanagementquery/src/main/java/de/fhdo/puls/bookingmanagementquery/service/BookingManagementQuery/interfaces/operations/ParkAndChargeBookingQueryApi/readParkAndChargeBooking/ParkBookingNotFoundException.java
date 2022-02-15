package de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.operations.ParkAndChargeBookingQueryApi.readParkAndChargeBooking;

import de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.operations.ParkAndChargeBookingQueryApi.readParkAndChargeBooking.gen.ParkBookingNotFoundExceptionGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkBookingNotFoundExceptionGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkBookingNotFoundException extends ParkBookingNotFoundExceptionGenImpl {

    public ParkBookingNotFoundException(String parkBookingNotFound) {
        super(parkBookingNotFound);
    }

    public ParkBookingNotFoundException(String parkBookingNotFound, String errorMessage) {
        super(parkBookingNotFound, errorMessage);
    }
}
