package de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.gen;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.CancelParkAndChargeBookingCommand;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.CreateParkAndChargeBookingCommand;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.UpdateParkAndChargeBookingCommand;
import de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkAndChargeBookingCommands.createParkAndChargeBooking.ContractBytecodeMismatchException;
import de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkAndChargeBookingCommands.createParkAndChargeBooking.ExceptionException;
import de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkAndChargeBookingCommands.updateParkAndChargeBooking.BookingNotFoundException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/resources/v1"})
public abstract class ParkAndChargeBookingCommandsGenImpl implements ParkAndChargeBookingCommandsGen {

    @ApiOperation(value = "API endpoint for creating a new park and charge booking.")
    @PutMapping(value = "/parkAndChargeBooking")
    protected void createParkAndChargeBooking(@ApiParam(value = "the command that includes all required booking data for generate an aggregate-object", required = true) @RequestBody() @Valid() CreateParkAndChargeBookingCommand createBookingCommand) throws ContractBytecodeMismatchException, ExceptionException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfCreateParkAndChargeBooking(CreateParkAndChargeBookingCommand createBookingCommand) {
        if (createBookingCommand == null)
            throw new IllegalArgumentException("Required parameter \"createBookingCommand\" must not be null");
    }

    @ApiOperation(value = "API endpoint for updating an existing park and charge booking.")
    @PostMapping(value = "/parkAndChargeBooking")
    protected void updateParkAndChargeBooking(@ApiParam(value = "the command that presents all changed booking data", required = true) @RequestBody() @Valid() UpdateParkAndChargeBookingCommand updateBookingCommand) throws de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkAndChargeBookingCommands.updateParkAndChargeBooking.ContractBytecodeMismatchException, BookingNotFoundException, de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkAndChargeBookingCommands.updateParkAndChargeBooking.ExceptionException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfUpdateParkAndChargeBooking(UpdateParkAndChargeBookingCommand updateBookingCommand) {
        if (updateBookingCommand == null)
            throw new IllegalArgumentException("Required parameter \"updateBookingCommand\" must not be null");
    }

    @ApiOperation(value = "API endpoint for deleting / canceling an existing park and charge booking.")
    @DeleteMapping(value = "/parkAndChargeBooking")
    protected void deletParkAndChargeBooking(@ApiParam(value = "the command that includes the bookingId of booking to be canceled.", required = true) @RequestBody() @Valid() CancelParkAndChargeBookingCommand cancelBookingCommand) throws de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkAndChargeBookingCommands.deletParkAndChargeBooking.ContractBytecodeMismatchException, de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkAndChargeBookingCommands.deletParkAndChargeBooking.BookingNotFoundException, de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkAndChargeBookingCommands.deletParkAndChargeBooking.ExceptionException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfDeletParkAndChargeBooking(CancelParkAndChargeBookingCommand cancelBookingCommand) {
        if (cancelBookingCommand == null)
            throw new IllegalArgumentException("Required parameter \"cancelBookingCommand\" must not be null");
    }
}
