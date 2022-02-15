package de.fhdo.puls.chargingstationmanagementcommand.service.ChargingStationManagementCommand.interfaces.gen;

import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.CreateParkingSpaceCommand;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/resources/v1"})
public abstract class ParkingSpaceCommandsGenImpl implements ParkingSpaceCommandsGen {

    @PutMapping(value = "/parkingSpace")
    protected void createParkingSpace(@RequestBody() CreateParkingSpaceCommand command) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfCreateParkingSpace(CreateParkingSpaceCommand command) {
        if (command == null)
            throw new IllegalArgumentException("Required parameter \"command\" must not be null");
    }
}
