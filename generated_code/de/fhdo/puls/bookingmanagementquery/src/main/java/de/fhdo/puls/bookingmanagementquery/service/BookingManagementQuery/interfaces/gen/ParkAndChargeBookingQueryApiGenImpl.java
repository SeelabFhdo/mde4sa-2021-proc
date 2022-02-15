package de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.gen;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.BlockchainDataParkAndChargeBooking;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkAndChargeBooking;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkAndChargeBookingList;
import de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.operations.ParkAndChargeBookingQueryApi.readParkAndChargeBooking.ParkBookingNotFoundException;
import de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.operations.ParkAndChargeBookingQueryApi.readParkAndParkBookingBlockchainData.ContractBytecodeMismatchException;
import de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.operations.ParkAndChargeBookingQueryApi.readParkAndParkBookingBlockchainData.ExceptionException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/resources/v1"})
public abstract class ParkAndChargeBookingQueryApiGenImpl implements ParkAndChargeBookingQueryApiGen {

    @ApiOperation(value = "API endpoint for retrieving information about a single parking and charge booking")
    @GetMapping(value = "/parkAndChargeBooking/{bookingId}")
    protected ResponseEntity<ParkAndChargeBooking> readParkAndChargeBooking(@ApiParam(value = "Identifier of the park and charge booking", required = true) @PathVariable() @Valid() Long bookingId) throws ParkBookingNotFoundException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfReadParkAndChargeBooking(Long bookingId) {
        if (bookingId == null)
            throw new IllegalArgumentException("Required parameter \"bookingId\" must not be null");
    }

    @ApiOperation(value = "API endpoint for all park and charge bookings")
    @GetMapping(value = "/parkAndChargeBookings")
    protected ResponseEntity<ParkAndChargeBookingList> readAllParkAndChargeBookings() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @ApiOperation(value = "API endpoint for blockchain booking data call")
    @GetMapping(value = "/parkAndChargeBooking/blockchainQuery/{bookingId}")
    protected ResponseEntity<BlockchainDataParkAndChargeBooking> readParkAndParkBookingBlockchainData(@ApiParam(value = "Identifier of the park and charge booking", required = true) @PathVariable() @Valid() Long bookingId) throws ContractBytecodeMismatchException, ExceptionException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfReadParkAndParkBookingBlockchainData(Long bookingId) {
        if (bookingId == null)
            throw new IllegalArgumentException("Required parameter \"bookingId\" must not be null");
    }

    @ApiOperation(value = "API endpoint for reading all current park and charge bookings of a given parking space")
    @GetMapping(value = "/currentParkAndChargeBookings/parkingSpace/{parkingSpaceId}")
    protected ResponseEntity<ParkAndChargeBookingList> readCurrentBookingsOfParkingSpace(@ApiParam(value = "Identifier of the parking space", required = true) @PathVariable() @Valid() Long parkingSpaceId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfReadCurrentBookingsOfParkingSpace(Long parkingSpaceId) {
        if (parkingSpaceId == null)
            throw new IllegalArgumentException("Required parameter \"parkingSpaceId\" must not be null");
    }

    @ApiOperation(value = "API endpoint for reading all canceled park and charge bookings of a given parking space")
    @GetMapping(value = "/canceledParkAndChargeBookings/parkingSpace/{parkingSpaceId}")
    protected ResponseEntity<ParkAndChargeBookingList> readCanceledBookingsOfParkingSpace(@ApiParam(value = "Identifier of the parking space", required = true) @PathVariable() @Valid() Long parkingSpaceId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfReadCanceledBookingsOfParkingSpace(Long parkingSpaceId) {
        if (parkingSpaceId == null)
            throw new IllegalArgumentException("Required parameter \"parkingSpaceId\" must not be null");
    }

    @ApiOperation(value = "API endpoint for reading all park and charge bookings of a given booker")
    @GetMapping(value = "/parkAndChargeBookings/booker/{bookerId}")
    protected ResponseEntity<ParkAndChargeBookingList> readParkAndChargeBookingsFromBooker(@ApiParam(value = "Identifier of the booker", required = true) @PathVariable() @Valid() Long bookerId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfReadParkAndChargeBookingsFromBooker(Long bookerId) {
        if (bookerId == null)
            throw new IllegalArgumentException("Required parameter \"bookerId\" must not be null");
    }

    @ApiOperation(value = "API endpoint for reading all current park and charge bookings of a given booker")
    @GetMapping(value = "/currentParkAndChargeBookings/booker/{bookerId}")
    protected ResponseEntity<ParkAndChargeBookingList> readCurrentParkAndChargeBookingsFromBooker(@ApiParam(value = "Identifier of the booker", required = true) @PathVariable() @Valid() Long bookerId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfReadCurrentParkAndChargeBookingsFromBooker(Long bookerId) {
        if (bookerId == null)
            throw new IllegalArgumentException("Required parameter \"bookerId\" must not be null");
    }

    @ApiOperation(value = "API endpoint for reading all canceled park and charge bookings of a given booker")
    @GetMapping(value = "/canceledParkAndChargeBookings/booker/{bookerId}")
    protected ResponseEntity<ParkAndChargeBookingList> readCanceledParkAndChargeBookingsFromBooker(@ApiParam(value = "Identifier of the booker", required = true) @PathVariable() @Valid() Long bookerId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfReadCanceledParkAndChargeBookingsFromBooker(Long bookerId) {
        if (bookerId == null)
            throw new IllegalArgumentException("Required parameter \"bookerId\" must not be null");
    }
}
