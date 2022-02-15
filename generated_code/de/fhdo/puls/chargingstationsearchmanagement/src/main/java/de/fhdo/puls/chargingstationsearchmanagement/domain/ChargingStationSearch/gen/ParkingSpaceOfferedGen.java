package de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.gen;

import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.Location;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.ParkingSpaceSize;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.TimePeriods;

public interface ParkingSpaceOfferedGen {

    String getParkingSpaceId();

    String getName();

    String getDescription();

    long getOwnerId();

    float getParkingPricePerHour();

    Location getLocation();

    TimePeriods getAvailabilityPeriods();

    ParkingSpaceSize getParkingSpaceSize();
}
