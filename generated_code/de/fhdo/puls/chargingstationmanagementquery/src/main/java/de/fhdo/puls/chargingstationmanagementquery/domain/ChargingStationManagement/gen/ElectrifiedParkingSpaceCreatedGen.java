package de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.gen;

import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ChargingType;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.Location;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ParkingSpaceSize;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.TimePeriods;

public interface ElectrifiedParkingSpaceCreatedGen {

    String getParkingSpaceId();

    String getName();

    String getDescription();

    long getOwnerId();

    float getParkingPricePerHour();

    boolean getActivated();

    boolean getBlocked();

    boolean getOffered();

    Location getLocation();

    ParkingSpaceSize getParkingSpaceSize();

    float getChargingPricePerKWH();

    ChargingType getChargingType();

    String getPluginType();

    TimePeriods getAvailablePeriods();
}
