package de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.CancelParkBookingCommand;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.CreateParkBookingCommand;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.UpdateParkBookingCommand;
import de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.gen.ParkBookingCommandsGenImpl;
import de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.createParkBooking.ContractBytecodeMismatchException;
import de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.createParkBooking.ExceptionException;
import de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.updateParkBooking.BookingNotFoundException;
import javax.validation.Valid;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkBookingCommandsGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Component()
@RestController()
public class ParkBookingCommands extends ParkBookingCommandsGenImpl {

    protected void createParkBooking(@RequestBody() @Valid() CreateParkBookingCommand createBookingCommand) throws ContractBytecodeMismatchException, ExceptionException {
        checkRequiredParametersOfCreateParkBooking(createBookingCommand);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        super.createParkBooking(createBookingCommand);
    }

    protected void updateParkBooking(@RequestBody() @Valid() UpdateParkBookingCommand updateBookingCommand) throws de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.updateParkBooking.ContractBytecodeMismatchException, BookingNotFoundException, de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.updateParkBooking.ExceptionException {
        checkRequiredParametersOfUpdateParkBooking(updateBookingCommand);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        super.updateParkBooking(updateBookingCommand);
    }

    protected void cancelParkBooking(@RequestBody() @Valid() CancelParkBookingCommand cancelBookingCommand) throws de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.cancelParkBooking.ContractBytecodeMismatchException, de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.cancelParkBooking.BookingNotFoundException, de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkBookingCommands.cancelParkBooking.ExceptionException {
        checkRequiredParametersOfCancelParkBooking(cancelBookingCommand);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        super.cancelParkBooking(cancelBookingCommand);
    }
}
