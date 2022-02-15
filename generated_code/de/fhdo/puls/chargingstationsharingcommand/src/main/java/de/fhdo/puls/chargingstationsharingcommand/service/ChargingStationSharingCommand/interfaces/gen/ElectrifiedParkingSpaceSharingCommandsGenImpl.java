package de.fhdo.puls.chargingstationsharingcommand.service.ChargingStationSharingCommand.interfaces.gen;

import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.OfferElectrifiedParkingSpaceCommand;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.WithdrawElectrifiedParkingSpaceCommand;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/resources/v1"})
public abstract class ElectrifiedParkingSpaceSharingCommandsGenImpl implements ElectrifiedParkingSpaceSharingCommandsGen {

    @PutMapping(value = "/offerElectrifiedParkingSpace")
    protected void offerElectrifiedParkingSpace(@RequestBody() OfferElectrifiedParkingSpaceCommand command) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfOfferElectrifiedParkingSpace(OfferElectrifiedParkingSpaceCommand command) {
        if (command == null)
            throw new IllegalArgumentException("Required parameter \"command\" must not be null");
    }

    @PutMapping(value = "/withdrawElectrifiedParkingSpace")
    protected void withdrawElectrifiedParkingSpace(@RequestBody() WithdrawElectrifiedParkingSpaceCommand command) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfWithdrawElectrifiedParkingSpace(WithdrawElectrifiedParkingSpaceCommand command) {
        if (command == null)
            throw new IllegalArgumentException("Required parameter \"command\" must not be null");
    }
}
