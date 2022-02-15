package de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.gen;

import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.Location;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ParkingSpaceSize;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.TimePeriods;
import java.util.Date;

public interface ParkingSpaceGen {

    String getId();

    void setId(String id);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    long getOwnerId();

    void setOwnerId(long ownerId);

    float getParkingPricePerHour();

    void setParkingPricePerHour(float parkingPricePerHour);

    Date getCreatedDate();

    void setCreatedDate(Date createdDate);

    Date getLastModifiedDate();

    void setLastModifiedDate(Date lastModifiedDate);

    boolean getActivated();

    void setActivated(boolean activated);

    boolean getBlocked();

    void setBlocked(boolean blocked);

    boolean getOffered();

    void setOffered(boolean offered);

    Location getLocation();

    void setLocation(Location location);

    TimePeriods getAvailabilityPeriods();

    void setAvailabilityPeriods(TimePeriods availabilityPeriods);

    ParkingSpaceSize getParkingSpaceSize();

    void setParkingSpaceSize(ParkingSpaceSize parkingSpaceSize);
}
