package de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement;

import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.Location;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.ParkingSpaceSize;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.TimePeriods;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.gen.CreateParkingSpaceCommandGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends CreateParkingSpaceCommandGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class CreateParkingSpaceCommand extends CreateParkingSpaceCommandGenImpl {

    public CreateParkingSpaceCommand() {
        super();
    }

    public CreateParkingSpaceCommand(String name, String description, long ownerId, float parkingPricePerHour, boolean activated, boolean blocked, boolean offered, Location location, TimePeriods availabilityPeriods, ParkingSpaceSize parkingSpaceSize) {
        super(name, description, ownerId, parkingPricePerHour, activated, blocked, offered, location, availabilityPeriods, parkingSpaceSize);
    }
}
