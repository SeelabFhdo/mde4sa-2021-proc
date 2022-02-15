package de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing;

import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.ChargingType;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.Location;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.ParkingSpaceSize;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.TimePeriods;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.gen.OfferedElectrifiedParkingSpaceGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends OfferedElectrifiedParkingSpaceGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class OfferedElectrifiedParkingSpace extends OfferedElectrifiedParkingSpaceGenImpl {

    public OfferedElectrifiedParkingSpace() {
        super();
    }

    public OfferedElectrifiedParkingSpace(String id, String parkingSpaceId, String name, String description, long ownerId, float parkingPricePerHour, float chargingPricePerKWH, Location location, TimePeriods availabilityPeriods, ParkingSpaceSize parkingSpaceSize, ChargingType chargingType, String pluginType) {
        super(id, parkingSpaceId, name, description, ownerId, parkingPricePerHour, chargingPricePerKWH, location, availabilityPeriods, parkingSpaceSize, chargingType, pluginType);
    }
}
