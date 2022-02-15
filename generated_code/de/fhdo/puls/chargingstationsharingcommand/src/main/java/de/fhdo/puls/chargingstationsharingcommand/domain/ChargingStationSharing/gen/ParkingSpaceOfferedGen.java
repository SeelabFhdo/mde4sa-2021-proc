package de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.gen;

import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.Location;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.ParkingSpaceSize;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.TimePeriods;

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
