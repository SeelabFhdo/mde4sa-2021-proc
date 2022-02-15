package de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.gen;

import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.Location;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.ParkingSpaceSize;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.TimePeriods;

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
