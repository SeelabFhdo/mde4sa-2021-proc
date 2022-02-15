package de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.gen;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.CancelParkBookingCommand;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.CreateParkBookingCommand;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.UpdateParkBookingCommand;
import de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.createParkBooking.ContractBytecodeMismatchException;
import de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.createParkBooking.ExceptionException;
import de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.updateParkBooking.BookingNotFoundException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/resources/v1"})
public abstract class ParkBookingCommandsGenImpl implements ParkBookingCommandsGen {

    @ApiOperation(value = "API endpoint for creating a new park booking.")
    @PutMapping(value = "/parkBooking")
    protected void createParkBooking(@ApiParam(value = "the command that includes all required booking data for generate an aggregate-object", required = true) @RequestBody() @Valid() CreateParkBookingCommand createBookingCommand) throws ContractBytecodeMismatchException, ExceptionException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfCreateParkBooking(CreateParkBookingCommand createBookingCommand) {
        if (createBookingCommand == null)
            throw new IllegalArgumentException("Required parameter \"createBookingCommand\" must not be null");
    }

    @ApiOperation(value = "API endpoint for updating an existing park booking.")
    @PostMapping(value = "/parkBooking")
    protected void updateParkBooking(@ApiParam(value = "the command that presents all changed booking data", required = true) @RequestBody() @Valid() UpdateParkBookingCommand updateBookingCommand) throws de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.updateParkBooking.ContractBytecodeMismatchException, BookingNotFoundException, de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.updateParkBooking.ExceptionException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfUpdateParkBooking(UpdateParkBookingCommand updateBookingCommand) {
        if (updateBookingCommand == null)
            throw new IllegalArgumentException("Required parameter \"updateBookingCommand\" must not be null");
    }

    @ApiOperation(value = "API endpoint for deleting / canceling an existing park booking.")
    @DeleteMapping(value = "/parkBooking")
    protected void cancelParkBooking(@ApiParam(value = "the command that includes the bookingId of booking to be canceled.", required = true) @RequestBody() @Valid() CancelParkBookingCommand cancelBookingCommand) throws de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.cancelParkBooking.ContractBytecodeMismatchException, de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.cancelParkBooking.BookingNotFoundException, de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.cancelParkBooking.ExceptionException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfCancelParkBooking(CancelParkBookingCommand cancelBookingCommand) {
        if (cancelBookingCommand == null)
            throw new IllegalArgumentException("Required parameter \"cancelBookingCommand\" must not be null");
    }
}
