package de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.gen;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.BlockchainDataParkBooking;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkBookingList;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkBookingVO;
import de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.operations.ParkBookingQueryApi.readParkBooking.BookingNotFoundException;
import de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.operations.ParkBookingQueryApi.readParkBookingBlockchainData.ContractBytecodeMismatchException;
import de.fhdo.puls.bookingmanagementquery.service.BookingManagementQuery.interfaces.operations.ParkBookingQueryApi.readParkBookingBlockchainData.ExceptionException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/resources/v1"})
public abstract class ParkBookingQueryApiGenImpl implements ParkBookingQueryApiGen {

    @ApiOperation(value = "API endpoint for retrieving information about a single parking booking")
    @GetMapping(value = "/parkBooking/{bookingId}")
    protected ResponseEntity<ParkBookingVO> readParkBooking(@ApiParam(value = "Identifier of the park booking", required = true) @PathVariable() Long bookingId) throws BookingNotFoundException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfReadParkBooking(Long bookingId) {
        if (bookingId == null)
            throw new IllegalArgumentException("Required parameter \"bookingId\" must not be null");
    }

    @ApiOperation(value = "API endpoint for all park bookings")
    @GetMapping(value = "/parkBookings")
    protected ResponseEntity<ParkBookingList> readAllParkBookings() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @ApiOperation(value = "API endpoint for blockchain booking data call")
    @GetMapping(value = "/parkBooking/blockchainQuery/{bookingId}")
    protected ResponseEntity<BlockchainDataParkBooking> readParkBookingBlockchainData(@ApiParam(value = "Identifier of the park booking", required = true) @PathVariable() @Valid() Long bookingId) throws ContractBytecodeMismatchException, ExceptionException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfReadParkBookingBlockchainData(Long bookingId) {
        if (bookingId == null)
            throw new IllegalArgumentException("Required parameter \"bookingId\" must not be null");
    }

    @ApiOperation(value = "API endpoint for reading all current park bookings of a given parking space")
    @GetMapping(value = "/currentParkBookings/parkingSpace/{parkingSpaceId}")
    protected ResponseEntity<ParkBookingList> readCurrentParkBookingsOfParkingSpace(@ApiParam(value = "Identifier of the parking space", required = true) @PathVariable() @Valid() Long parkingSpaceId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfReadCurrentParkBookingsOfParkingSpace(Long parkingSpaceId) {
        if (parkingSpaceId == null)
            throw new IllegalArgumentException("Required parameter \"parkingSpaceId\" must not be null");
    }

    @ApiOperation(value = "API endpoint for reading all canceled park bookings of a given parking space")
    @GetMapping(value = "/canceledParkBookings/parkingSpace/{parkingSpaceId}")
    protected ResponseEntity<ParkBookingList> readCanceledParkBookingsOfParkingSpace(@ApiParam(value = "Identifier of the parking space", required = true) @PathVariable() @Valid() Long parkingSpaceId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfReadCanceledParkBookingsOfParkingSpace(Long parkingSpaceId) {
        if (parkingSpaceId == null)
            throw new IllegalArgumentException("Required parameter \"parkingSpaceId\" must not be null");
    }

    @ApiOperation(value = "API endpoint for reading all park bookings of a given booker")
    @GetMapping(value = "/parkBookings/booker/{bookerId}")
    protected ResponseEntity<ParkBookingList> readParkBookingsFromBooker(@ApiParam(value = "Identifier of the booker", required = true) @PathVariable() @Valid() Long bookerId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfReadParkBookingsFromBooker(Long bookerId) {
        if (bookerId == null)
            throw new IllegalArgumentException("Required parameter \"bookerId\" must not be null");
    }

    @ApiOperation(value = "API endpoint for reading all current park bookings of a given booker")
    @GetMapping(value = "/currentParkBookings/booker/{bookerId}")
    protected ResponseEntity<ParkBookingList> readCurrentParkBookingsFromBooker(@ApiParam(value = "Identifier of the booker", required = true) @PathVariable() @Valid() Long bookerId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfReadCurrentParkBookingsFromBooker(Long bookerId) {
        if (bookerId == null)
            throw new IllegalArgumentException("Required parameter \"bookerId\" must not be null");
    }

    @ApiOperation(value = "API endpoint for reading all canceled park bookings of a given booker")
    @GetMapping(value = "/canceledParkBookings/booker/{bookerId}")
    protected ResponseEntity<ParkBookingList> readCanceledParkBookingsFromBooker(@ApiParam(value = "Identifier of the booker", required = true) @PathVariable() @Valid() Long bookerId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfReadCanceledParkBookingsFromBooker(Long bookerId) {
        if (bookerId == null)
            throw new IllegalArgumentException("Required parameter \"bookerId\" must not be null");
    }
}
