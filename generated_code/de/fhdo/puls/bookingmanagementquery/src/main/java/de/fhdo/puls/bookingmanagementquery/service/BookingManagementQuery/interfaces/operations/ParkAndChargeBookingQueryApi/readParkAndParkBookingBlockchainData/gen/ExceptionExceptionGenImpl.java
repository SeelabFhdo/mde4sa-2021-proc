package de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.operations.ParkAndChargeBookingQueryApi.readParkAndParkBookingBlockchainData.gen;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public abstract class ExceptionExceptionGenImpl extends RuntimeException implements ExceptionExceptionGen {

    protected String exception;

    protected String errorMessage;

    public ExceptionExceptionGenImpl(String exception) {
        super();
        this.exception = exception;
    }

    public ExceptionExceptionGenImpl(String exception, String errorMessage) {
        super(errorMessage);
        this.exception = exception;
        this.errorMessage = errorMessage;
    }
}
