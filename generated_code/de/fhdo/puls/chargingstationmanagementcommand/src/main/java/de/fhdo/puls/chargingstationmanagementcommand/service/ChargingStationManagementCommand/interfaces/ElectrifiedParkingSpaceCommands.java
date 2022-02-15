package de.fhdo.puls.chargingstationmanagementcommand.service.ChargingStationManagementCommand.interfaces;

import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.CreateElectrifiedParkingSpaceCommand;
import de.fhdo.puls.chargingstationmanagementcommand.service.ChargingStationManagementCommand.interfaces.gen.ElectrifiedParkingSpaceCommandsGenImpl;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ElectrifiedParkingSpaceCommandsGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Component()
@RestController()
public class ElectrifiedParkingSpaceCommands extends ElectrifiedParkingSpaceCommandsGenImpl {

    protected void createElectrifiedParkingSpace(@RequestBody() CreateElectrifiedParkingSpaceCommand command) {
        checkRequiredParametersOfCreateElectrifiedParkingSpace(command);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        super.createElectrifiedParkingSpace(command);
    }
}
