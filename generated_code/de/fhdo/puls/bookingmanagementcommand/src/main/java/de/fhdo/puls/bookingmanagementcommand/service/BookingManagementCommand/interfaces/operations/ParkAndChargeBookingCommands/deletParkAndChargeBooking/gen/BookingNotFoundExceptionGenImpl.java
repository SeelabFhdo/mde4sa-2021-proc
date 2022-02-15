package de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkAndChargeBookingCommands.deletParkAndChargeBooking.gen;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public abstract class BookingNotFoundExceptionGenImpl extends RuntimeException implements BookingNotFoundExceptionGen {

    protected String bookingNotFound;

    protected String errorMessage;

    public BookingNotFoundExceptionGenImpl(String bookingNotFound) {
        super();
        this.bookingNotFound = bookingNotFound;
    }

    public BookingNotFoundExceptionGenImpl(String bookingNotFound, String errorMessage) {
        super(errorMessage);
        this.bookingNotFound = bookingNotFound;
        this.errorMessage = errorMessage;
    }
}
