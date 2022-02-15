package de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.operations.ParkAndChargeBookingQueryApi.readParkAndParkBookingBlockchainData.gen;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public abstract class ContractBytecodeMismatchExceptionGenImpl extends RuntimeException implements ContractBytecodeMismatchExceptionGen {

    protected String contractBytecodeMismatch;

    protected String errorMessage;

    public ContractBytecodeMismatchExceptionGenImpl(String contractBytecodeMismatch) {
        super();
        this.contractBytecodeMismatch = contractBytecodeMismatch;
    }

    public ContractBytecodeMismatchExceptionGenImpl(String contractBytecodeMismatch, String errorMessage) {
        super(errorMessage);
        this.contractBytecodeMismatch = contractBytecodeMismatch;
        this.errorMessage = errorMessage;
    }
}
