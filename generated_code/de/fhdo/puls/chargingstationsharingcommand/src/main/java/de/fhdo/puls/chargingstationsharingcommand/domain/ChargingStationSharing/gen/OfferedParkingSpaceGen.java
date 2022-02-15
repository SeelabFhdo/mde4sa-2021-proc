package de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.gen;

import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.Location;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.ParkingSpaceSize;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.TimePeriods;

public interface OfferedParkingSpaceGen {

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

    Location getLocation();

    void setLocation(Location location);

    TimePeriods getAvailabilityPeriods();

    void setAvailabilityPeriods(TimePeriods availabilityPeriods);

    ParkingSpaceSize getParkingSpaceSize();

    void setParkingSpaceSize(ParkingSpaceSize parkingSpaceSize);
}
