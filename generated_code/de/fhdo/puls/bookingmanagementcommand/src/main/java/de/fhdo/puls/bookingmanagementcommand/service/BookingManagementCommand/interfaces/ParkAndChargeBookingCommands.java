package de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.CancelParkAndChargeBookingCommand;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.CreateParkAndChargeBookingCommand;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.UpdateParkAndChargeBookingCommand;
import de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.gen.ParkAndChargeBookingCommandsGenImpl;
import de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkAndChargeBookingCommands.createParkAndChargeBooking.ContractBytecodeMismatchException;
import de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkAndChargeBookingCommands.createParkAndChargeBooking.ExceptionException;
import de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkAndChargeBookingCommands.updateParkAndChargeBooking.BookingNotFoundException;
import javax.validation.Valid;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkAndChargeBookingCommandsGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Component()
@RestController()
public class ParkAndChargeBookingCommands extends ParkAndChargeBookingCommandsGenImpl {

    protected void createParkAndChargeBooking(@RequestBody() @Valid() CreateParkAndChargeBookingCommand createBookingCommand) throws ContractBytecodeMismatchException, ExceptionException {
        checkRequiredParametersOfCreateParkAndChargeBooking(createBookingCommand);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        super.createParkAndChargeBooking(createBookingCommand);
    }

    protected void updateParkAndChargeBooking(@RequestBody() @Valid() UpdateParkAndChargeBookingCommand updateBookingCommand) throws de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkAndChargeBookingCommands.updateParkAndChargeBooking.ContractBytecodeMismatchException, BookingNotFoundException, de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkAndChargeBookingCommands.updateParkAndChargeBooking.ExceptionException {
        checkRequiredParametersOfUpdateParkAndChargeBooking(updateBookingCommand);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        super.updateParkAndChargeBooking(updateBookingCommand);
    }

    protected void deletParkAndChargeBooking(@RequestBody() @Valid() CancelParkAndChargeBookingCommand cancelBookingCommand) throws de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkAndChargeBookingCommands.deletParkAndChargeBooking.ContractBytecodeMismatchException, de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkAndChargeBookingCommands.deletParkAndChargeBooking.BookingNotFoundException, de.fhdo.puls.bookingmanagementcommand.service.BookingManagementCommand.interfaces.operations.ParkAndChargeBookingCommands.deletParkAndChargeBooking.ExceptionException {
        checkRequiredParametersOfDeletParkAndChargeBooking(cancelBookingCommand);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        super.deletParkAndChargeBooking(cancelBookingCommand);
    }
}
