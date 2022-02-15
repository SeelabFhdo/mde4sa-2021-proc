package de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch;

import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.Location;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.ParkingSpaceSize;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.TimePeriods;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.gen.ParkingSpaceOfferedGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkingSpaceOfferedGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkingSpaceOffered extends ParkingSpaceOfferedGenImpl {

    public ParkingSpaceOffered() {
        super();
    }

    public ParkingSpaceOffered(String parkingSpaceId, String name, String description, long ownerId, float parkingPricePerHour, Location location, TimePeriods availabilityPeriods, ParkingSpaceSize parkingSpaceSize) {
        super(parkingSpaceId, name, description, ownerId, parkingPricePerHour, location, availabilityPeriods, parkingSpaceSize);
    }
}
