package de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.operations.ParkAndChargeBookingQueryApi.readParkAndChargeBooking.gen;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public abstract class ParkBookingNotFoundExceptionGenImpl extends RuntimeException implements ParkBookingNotFoundExceptionGen {

    protected String parkBookingNotFound;

    protected String errorMessage;

    public ParkBookingNotFoundExceptionGenImpl(String parkBookingNotFound) {
        super();
        this.parkBookingNotFound = parkBookingNotFound;
    }

    public ParkBookingNotFoundExceptionGenImpl(String parkBookingNotFound, String errorMessage) {
        super(errorMessage);
        this.parkBookingNotFound = parkBookingNotFound;
        this.errorMessage = errorMessage;
    }
}
