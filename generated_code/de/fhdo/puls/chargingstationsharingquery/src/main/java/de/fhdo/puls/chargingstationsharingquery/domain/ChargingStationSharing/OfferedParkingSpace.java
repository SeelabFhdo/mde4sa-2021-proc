package de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing;

import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.Location;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.ParkingSpaceSize;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.TimePeriods;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.gen.OfferedParkingSpaceGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends OfferedParkingSpaceGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class OfferedParkingSpace extends OfferedParkingSpaceGenImpl {

    public OfferedParkingSpace() {
        super();
    }

    public OfferedParkingSpace(String id, String parkingSpaceId, String name, String description, long ownerId, float parkingPricePerHour, Location location, TimePeriods availabilityPeriods, ParkingSpaceSize parkingSpaceSize) {
        super(id, parkingSpaceId, name, description, ownerId, parkingPricePerHour, location, availabilityPeriods, parkingSpaceSize);
    }
}
