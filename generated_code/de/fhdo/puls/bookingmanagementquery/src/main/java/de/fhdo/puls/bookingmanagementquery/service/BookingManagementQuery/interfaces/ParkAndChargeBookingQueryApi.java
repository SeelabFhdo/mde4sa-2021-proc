package de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.BlockchainDataParkAndChargeBooking;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkAndChargeBooking;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkAndChargeBookingList;
import de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.gen.ParkAndChargeBookingQueryApiGenImpl;
import de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.operations.ParkAndChargeBookingQueryApi.readParkAndChargeBooking.ParkBookingNotFoundException;
import de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.operations.ParkAndChargeBookingQueryApi.readParkAndParkBookingBlockchainData.ContractBytecodeMismatchException;
import de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.operations.ParkAndChargeBookingQueryApi.readParkAndParkBookingBlockchainData.ExceptionException;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkAndChargeBookingQueryApiGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Component()
@RestController()
public class ParkAndChargeBookingQueryApi extends ParkAndChargeBookingQueryApiGenImpl {

    protected ResponseEntity<ParkAndChargeBooking> readParkAndChargeBooking(@PathVariable() @Valid() Long bookingId) throws ParkBookingNotFoundException {
        checkRequiredParametersOfReadParkAndChargeBooking(bookingId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.readParkAndChargeBooking(bookingId);
    }

    protected ResponseEntity<ParkAndChargeBookingList> readAllParkAndChargeBookings() {
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.readAllParkAndChargeBookings();
    }

    protected ResponseEntity<BlockchainDataParkAndChargeBooking> readParkAndParkBookingBlockchainData(@PathVariable() @Valid() Long bookingId) throws ContractBytecodeMismatchException, ExceptionException {
        checkRequiredParametersOfReadParkAndParkBookingBlockchainData(bookingId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.readParkAndParkBookingBlockchainData(bookingId);
    }

    protected ResponseEntity<ParkAndChargeBookingList> readCurrentBookingsOfParkingSpace(@PathVariable() @Valid() Long parkingSpaceId) {
        checkRequiredParametersOfReadCurrentBookingsOfParkingSpace(parkingSpaceId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.readCurrentBookingsOfParkingSpace(parkingSpaceId);
    }

    protected ResponseEntity<ParkAndChargeBookingList> readCanceledBookingsOfParkingSpace(@PathVariable() @Valid() Long parkingSpaceId) {
        checkRequiredParametersOfReadCanceledBookingsOfParkingSpace(parkingSpaceId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.readCanceledBookingsOfParkingSpace(parkingSpaceId);
    }

    protected ResponseEntity<ParkAndChargeBookingList> readParkAndChargeBookingsFromBooker(@PathVariable() @Valid() Long bookerId) {
        checkRequiredParametersOfReadParkAndChargeBookingsFromBooker(bookerId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.readParkAndChargeBookingsFromBooker(bookerId);
    }

    protected ResponseEntity<ParkAndChargeBookingList> readCurrentParkAndChargeBookingsFromBooker(@PathVariable() @Valid() Long bookerId) {
        checkRequiredParametersOfReadCurrentParkAndChargeBookingsFromBooker(bookerId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.readCurrentParkAndChargeBookingsFromBooker(bookerId);
    }

    protected ResponseEntity<ParkAndChargeBookingList> readCanceledParkAndChargeBookingsFromBooker(@PathVariable() @Valid() Long bookerId) {
        checkRequiredParametersOfReadCanceledParkAndChargeBookingsFromBooker(bookerId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.readCanceledParkAndChargeBookingsFromBooker(bookerId);
    }
}
