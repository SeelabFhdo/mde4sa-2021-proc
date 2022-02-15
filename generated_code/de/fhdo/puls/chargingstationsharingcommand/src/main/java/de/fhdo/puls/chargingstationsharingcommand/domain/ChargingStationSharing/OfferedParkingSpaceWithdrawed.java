package de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing;

import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.Location;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.gen.OfferedParkingSpaceWithdrawedGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends OfferedParkingSpaceWithdrawedGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class OfferedParkingSpaceWithdrawed extends OfferedParkingSpaceWithdrawedGenImpl {

    public OfferedParkingSpaceWithdrawed() {
        super();
    }

    public OfferedParkingSpaceWithdrawed(String parkingSpaceId, String name, String description, long ownerId, Location location) {
        super(parkingSpaceId, name, description, ownerId, location);
    }
}
