package de.fhdo.puls.chargingstationsharingcommand.service.ChargingStationSharingCommand.interfaces.gen;

import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.OfferParkingSpaceCommand;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.WithdrawParkingSpaceCommand;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/resources/v1"})
public abstract class ParkingSpaceSharingCommandsGenImpl implements ParkingSpaceSharingCommandsGen {

    @PutMapping(value = "/offerParkingSpace")
    protected void offerParkingSpace(@RequestBody() OfferParkingSpaceCommand command) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfOfferParkingSpace(OfferParkingSpaceCommand command) {
        if (command == null)
            throw new IllegalArgumentException("Required parameter \"command\" must not be null");
    }

    @PutMapping(value = "/withdrawParkingSpace")
    protected void withdrawParkingSpace(@RequestBody() WithdrawParkingSpaceCommand command) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfWithdrawParkingSpace(WithdrawParkingSpaceCommand command) {
        if (command == null)
            throw new IllegalArgumentException("Required parameter \"command\" must not be null");
    }
}
