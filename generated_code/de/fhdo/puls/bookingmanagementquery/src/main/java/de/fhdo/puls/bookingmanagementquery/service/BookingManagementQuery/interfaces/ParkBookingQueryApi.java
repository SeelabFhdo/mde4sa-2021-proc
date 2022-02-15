package de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.BlockchainDataParkBooking;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkBookingList;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkBookingVO;
import de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.gen.ParkBookingQueryApiGenImpl;
import de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.operations.ParkBookingQueryApi.readParkBooking.BookingNotFoundException;
import de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.operations.ParkBookingQueryApi.readParkBookingBlockchainData.ContractBytecodeMismatchException;
import de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.operations.ParkBookingQueryApi.readParkBookingBlockchainData.ExceptionException;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkBookingQueryApiGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Component()
@RestController()
public class ParkBookingQueryApi extends ParkBookingQueryApiGenImpl {

    protected ResponseEntity<ParkBookingVO> readParkBooking(@PathVariable() Long bookingId) throws BookingNotFoundException {
        checkRequiredParametersOfReadParkBooking(bookingId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.readParkBooking(bookingId);
    }

    protected ResponseEntity<ParkBookingList> readAllParkBookings() {
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.readAllParkBookings();
    }

    protected ResponseEntity<BlockchainDataParkBooking> readParkBookingBlockchainData(@PathVariable() @Valid() Long bookingId) throws ContractBytecodeMismatchException, ExceptionException {
        checkRequiredParametersOfReadParkBookingBlockchainData(bookingId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.readParkBookingBlockchainData(bookingId);
    }

    protected ResponseEntity<ParkBookingList> readCurrentParkBookingsOfParkingSpace(@PathVariable() @Valid() Long parkingSpaceId) {
        checkRequiredParametersOfReadCurrentParkBookingsOfParkingSpace(parkingSpaceId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.readCurrentParkBookingsOfParkingSpace(parkingSpaceId);
    }

    protected ResponseEntity<ParkBookingList> readCanceledParkBookingsOfParkingSpace(@PathVariable() @Valid() Long parkingSpaceId) {
        checkRequiredParametersOfReadCanceledParkBookingsOfParkingSpace(parkingSpaceId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.readCanceledParkBookingsOfParkingSpace(parkingSpaceId);
    }

    protected ResponseEntity<ParkBookingList> readParkBookingsFromBooker(@PathVariable() @Valid() Long bookerId) {
        checkRequiredParametersOfReadParkBookingsFromBooker(bookerId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.readParkBookingsFromBooker(bookerId);
    }

    protected ResponseEntity<ParkBookingList> readCurrentParkBookingsFromBooker(@PathVariable() @Valid() Long bookerId) {
        checkRequiredParametersOfReadCurrentParkBookingsFromBooker(bookerId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.readCurrentParkBookingsFromBooker(bookerId);
    }

    protected ResponseEntity<ParkBookingList> readCanceledParkBookingsFromBooker(@PathVariable() @Valid() Long bookerId) {
        checkRequiredParametersOfReadCanceledParkBookingsFromBooker(bookerId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.readCanceledParkBookingsFromBooker(bookerId);
    }
}
