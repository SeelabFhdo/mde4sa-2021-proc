package de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement;

import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ElectrifiedParkingSpace;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.gen.ElectrifiedParkingSpaceRepositoryGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ElectrifiedParkingSpaceRepositoryGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ElectrifiedParkingSpaceRepository extends ElectrifiedParkingSpaceRepositoryGenImpl {

    public ElectrifiedParkingSpaceRepository() {
        super();
    }

    public ElectrifiedParkingSpaceRepository(ElectrifiedParkingSpace electrifiedParkingSpaceAggregate, String id) {
        super(electrifiedParkingSpaceAggregate, id);
    }
}
