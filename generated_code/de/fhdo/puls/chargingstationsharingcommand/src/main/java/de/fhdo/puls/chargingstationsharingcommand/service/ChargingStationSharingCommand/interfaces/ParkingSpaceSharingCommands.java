package de.fhdo.puls.chargingstationsharingcommand.service.ChargingStationSharingCommand.interfaces;

import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.OfferParkingSpaceCommand;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.WithdrawParkingSpaceCommand;
import de.fhdo.puls.chargingstationsharingcommand.service.ChargingStationSharingCommand.interfaces.gen.ParkingSpaceSharingCommandsGenImpl;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkingSpaceSharingCommandsGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Component()
@RestController()
public class ParkingSpaceSharingCommands extends ParkingSpaceSharingCommandsGenImpl {

    protected void offerParkingSpace(@RequestBody() OfferParkingSpaceCommand command) {
        checkRequiredParametersOfOfferParkingSpace(command);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        super.offerParkingSpace(command);
    }

    protected void withdrawParkingSpace(@RequestBody() WithdrawParkingSpaceCommand command) {
        checkRequiredParametersOfWithdrawParkingSpace(command);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        super.withdrawParkingSpace(command);
    }
}
