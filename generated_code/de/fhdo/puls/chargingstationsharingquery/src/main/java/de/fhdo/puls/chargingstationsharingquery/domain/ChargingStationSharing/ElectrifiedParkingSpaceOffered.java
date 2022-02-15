package de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing;

import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.ChargingType;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.Location;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.ParkingSpaceSize;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.TimePeriods;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.gen.ElectrifiedParkingSpaceOfferedGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ElectrifiedParkingSpaceOfferedGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ElectrifiedParkingSpaceOffered extends ElectrifiedParkingSpaceOfferedGenImpl {

    public ElectrifiedParkingSpaceOffered() {
        super();
    }

    public ElectrifiedParkingSpaceOffered(String parkingSpaceId, String name, String description, long ownerId, float parkingPricePerHour, float chargingPricePerKWH, Location location, TimePeriods availabilityPeriods, ParkingSpaceSize parkingSpaceSize, ChargingType chargingType, String pluginType) {
        super(parkingSpaceId, name, description, ownerId, parkingPricePerHour, chargingPricePerKWH, location, availabilityPeriods, parkingSpaceSize, chargingType, pluginType);
    }
}
