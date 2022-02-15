package de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch;

import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.gen.LocationDataDtoGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends LocationDataDtoGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class LocationDataDto extends LocationDataDtoGenImpl {

    public LocationDataDto() {
        super();
    }

    public LocationDataDto(String id, String refId, String address, String extFilter, String lat, String lng) {
        super(id, refId, address, extFilter, lat, lng);
    }
}
