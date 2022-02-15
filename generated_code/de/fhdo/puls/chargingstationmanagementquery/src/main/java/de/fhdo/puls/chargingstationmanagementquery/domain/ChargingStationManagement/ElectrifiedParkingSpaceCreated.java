package de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement;

import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ChargingType;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.Location;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ParkingSpaceSize;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.TimePeriods;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.gen.ElectrifiedParkingSpaceCreatedGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ElectrifiedParkingSpaceCreatedGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ElectrifiedParkingSpaceCreated extends ElectrifiedParkingSpaceCreatedGenImpl {

    public ElectrifiedParkingSpaceCreated() {
        super();
    }

    public ElectrifiedParkingSpaceCreated(String parkingSpaceId, String name, String description, long ownerId, float parkingPricePerHour, boolean activated, boolean blocked, boolean offered, Location location, ParkingSpaceSize parkingSpaceSize, float chargingPricePerKWH, ChargingType chargingType, String pluginType, TimePeriods availablePeriods) {
        super(parkingSpaceId, name, description, ownerId, parkingPricePerHour, activated, blocked, offered, location, parkingSpaceSize, chargingPricePerKWH, chargingType, pluginType, availablePeriods);
    }
}
