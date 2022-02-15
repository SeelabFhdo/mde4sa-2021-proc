package de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.cancelParkBooking;

import de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.cancelParkBooking.gen.BookingNotFoundExceptionGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends BookingNotFoundExceptionGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class BookingNotFoundException extends BookingNotFoundExceptionGenImpl {

    public BookingNotFoundException(String bookingNotFound) {
        super(bookingNotFound);
    }

    public BookingNotFoundException(String bookingNotFound, String errorMessage) {
        super(bookingNotFound, errorMessage);
    }
}
