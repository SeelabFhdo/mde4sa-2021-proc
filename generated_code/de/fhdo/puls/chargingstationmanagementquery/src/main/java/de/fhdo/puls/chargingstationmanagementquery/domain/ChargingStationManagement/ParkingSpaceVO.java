package de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement;

import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.Location;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ParkingSpaceSize;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.TimePeriods;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.gen.ParkingSpaceVOGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkingSpaceVOGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkingSpaceVO extends ParkingSpaceVOGenImpl {

    public ParkingSpaceVO() {
        super();
    }

    public ParkingSpaceVO(String id, String name, String description, long ownerId, float parkingPricePerHour, boolean activated, boolean blocked, boolean offered, Location location, TimePeriods availabilityPeriods, ParkingSpaceSize parkingSpaceSize) {
        super(id, name, description, ownerId, parkingPricePerHour, activated, blocked, offered, location, availabilityPeriods, parkingSpaceSize);
    }
}
