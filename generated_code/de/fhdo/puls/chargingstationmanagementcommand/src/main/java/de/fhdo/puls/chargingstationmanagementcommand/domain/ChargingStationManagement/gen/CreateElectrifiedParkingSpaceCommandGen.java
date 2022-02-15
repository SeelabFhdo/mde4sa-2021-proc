package de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.gen;

import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.ChargingType;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.Location;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.ParkingSpaceSize;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.TimePeriods;

public interface CreateElectrifiedParkingSpaceCommandGen {

    String getName();

    String getDescription();

    long getOwnerId();

    float getParkingPricePerHour();

    boolean getActivated();

    boolean getBlocked();

    boolean getOffered();

    Location getLocation();

    TimePeriods getAvailabilityPeriods();

    ParkingSpaceSize getParkingSpaceSize();

    float getChargingPricePerKWH();

    ChargingType getChargingType();

    String getPluginType();
}
