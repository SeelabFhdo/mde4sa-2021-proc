package de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.gen;

import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.ChargingType;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.Location;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.ParkingSpaceSize;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.TimePeriods;

public interface OfferedElectrifiedParkingSpaceGen {

    String getId();

    void setId(String id);

    String getParkingSpaceId();

    void setParkingSpaceId(String parkingSpaceId);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    long getOwnerId();

    void setOwnerId(long ownerId);

    float getParkingPricePerHour();

    void setParkingPricePerHour(float parkingPricePerHour);

    float getChargingPricePerKWH();

    void setChargingPricePerKWH(float chargingPricePerKWH);

    Location getLocation();

    void setLocation(Location location);

    TimePeriods getAvailabilityPeriods();

    void setAvailabilityPeriods(TimePeriods availabilityPeriods);

    ParkingSpaceSize getParkingSpaceSize();

    void setParkingSpaceSize(ParkingSpaceSize parkingSpaceSize);

    ChargingType getChargingType();

    void setChargingType(ChargingType chargingType);

    String getPluginType();

    void setPluginType(String pluginType);
}
