package de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement;

import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.Location;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ParkingSpaceSize;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.TimePeriods;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.gen.ParkingSpaceGenImpl;
import java.util.Date;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkingSpaceGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkingSpace extends ParkingSpaceGenImpl {

    public ParkingSpace() {
        super();
    }

    public ParkingSpace(String id, String name, String description, long ownerId, float parkingPricePerHour, Date createdDate, Date lastModifiedDate, boolean activated, boolean blocked, boolean offered, Location location, TimePeriods availabilityPeriods, ParkingSpaceSize parkingSpaceSize) {
        super(id, name, description, ownerId, parkingPricePerHour, createdDate, lastModifiedDate, activated, blocked, offered, location, availabilityPeriods, parkingSpaceSize);
    }
}
