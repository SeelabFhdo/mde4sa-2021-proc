package de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement;

import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ParkingSpace;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.gen.ParkingSpaceRepositoryGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkingSpaceRepositoryGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkingSpaceRepository extends ParkingSpaceRepositoryGenImpl {

    public ParkingSpaceRepository() {
        super();
    }

    public ParkingSpaceRepository(ParkingSpace parkingSpaceAggregate, String id) {
        super(parkingSpaceAggregate, id);
    }
}
