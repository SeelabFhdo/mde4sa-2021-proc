package de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch;

import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.Location;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.gen.LocationDataGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends LocationDataGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class LocationData extends LocationDataGenImpl {

    public LocationData() {
        super();
    }

    public LocationData(String id, String refId, String address, String extFilter, Location location) {
        super(id, refId, address, extFilter, location);
    }
}
