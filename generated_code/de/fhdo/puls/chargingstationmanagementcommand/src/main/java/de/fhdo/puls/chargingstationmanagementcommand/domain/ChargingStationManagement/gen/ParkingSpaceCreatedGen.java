package de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.gen;

import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.Location;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.ParkingSpaceSize;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.TimePeriods;

public interface ParkingSpaceCreatedGen {

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

    TimePeriods getAvailablePeriods();
}
