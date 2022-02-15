package de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.gen;

import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.LocationDataDto;
import java.util.ArrayList;

public abstract class LocationDataDtosGenImpl extends ArrayList<LocationDataDtosGenImpl.LocationDataDtosItem> implements LocationDataDtosGen {

    public static class LocationDataDtosItem {

        public LocationDataDtosItem() {
        }

        private LocationDataDto ldd;

        public LocationDataDto getLdd() {
            return ldd;
        }

        public void setLdd(LocationDataDto ldd) {
            this.ldd = ldd;
        }

        public LocationDataDtosItem(LocationDataDto ldd) {
            this.ldd = ldd;
        }
    }
}
