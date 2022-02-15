package de.fhdo.puls.chargingstationmanagementcommand.service.ChargingStationManagementCommand.interfaces.gen;

import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.CreateElectrifiedParkingSpaceCommand;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/resources/v1"})
public abstract class ElectrifiedParkingSpaceCommandsGenImpl implements ElectrifiedParkingSpaceCommandsGen {

    @PutMapping(value = "/electrifiedParkingSpace")
    protected void createElectrifiedParkingSpace(@RequestBody() CreateElectrifiedParkingSpaceCommand command) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfCreateElectrifiedParkingSpace(CreateElectrifiedParkingSpaceCommand command) {
        if (command == null)
            throw new IllegalArgumentException("Required parameter \"command\" must not be null");
    }
}
