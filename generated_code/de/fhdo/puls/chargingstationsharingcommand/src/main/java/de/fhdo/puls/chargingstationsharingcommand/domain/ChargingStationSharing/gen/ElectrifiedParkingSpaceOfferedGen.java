package de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.gen;

import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.ChargingType;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.Location;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.ParkingSpaceSize;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.TimePeriods;

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
