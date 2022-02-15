package de.fhdo.puls.chargingstationsharingcommand.service.ChargingStationSharingCommand.interfaces;

import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.OfferElectrifiedParkingSpaceCommand;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.WithdrawElectrifiedParkingSpaceCommand;
import de.fhdo.puls.chargingstationsharingcommand.service.ChargingStationSharingCommand.interfaces.gen.ElectrifiedParkingSpaceSharingCommandsGenImpl;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ElectrifiedParkingSpaceSharingCommandsGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Component()
@RestController()
public class ElectrifiedParkingSpaceSharingCommands extends ElectrifiedParkingSpaceSharingCommandsGenImpl {

    protected void offerElectrifiedParkingSpace(@RequestBody() OfferElectrifiedParkingSpaceCommand command) {
        checkRequiredParametersOfOfferElectrifiedParkingSpace(command);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        super.offerElectrifiedParkingSpace(command);
    }

    protected void withdrawElectrifiedParkingSpace(@RequestBody() WithdrawElectrifiedParkingSpaceCommand command) {
        checkRequiredParametersOfWithdrawElectrifiedParkingSpace(command);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        super.withdrawElectrifiedParkingSpace(command);
    }
}
