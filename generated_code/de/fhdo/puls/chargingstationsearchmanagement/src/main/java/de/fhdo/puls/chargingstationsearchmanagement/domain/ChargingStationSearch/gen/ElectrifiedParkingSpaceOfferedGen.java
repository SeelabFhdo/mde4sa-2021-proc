package de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.gen;

import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.ChargingType;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.Location;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.ParkingSpaceSize;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.TimePeriods;

public interface ElectrifiedParkingSpaceOfferedGen {

    String getParkingSpaceId();

    String getName();

    String getDescription();

    long getOwnerId();

    float getParkingPricePerHour();

    float getChargingPricePerKWH();

    Location getLocation();

    TimePeriods getAvailabilityPeriods();

    ParkingSpaceSize getParkingSpaceSize();

    ChargingType getChargingType();

    String getPluginType();
}
