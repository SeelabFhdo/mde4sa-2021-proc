package de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.gen;

import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.Location;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.ParkingSpaceSize;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.TimePeriods;

public abstract class ParkingSpaceOfferedGenImpl implements ParkingSpaceOfferedGen {

    public ParkingSpaceOfferedGenImpl() {
    }

    protected String parkingSpaceId;

    @Override
    public String getParkingSpaceId() {
        return parkingSpaceId;
    }

    protected String name;

    @Override
    public String getName() {
        return name;
    }

    protected String description;

    @Override
    public String getDescription() {
        return description;
    }

    protected long ownerId;

    @Override
    public long getOwnerId() {
        return ownerId;
    }

    protected float parkingPricePerHour;

    @Override
    public float getParkingPricePerHour() {
        return parkingPricePerHour;
    }

    protected Location location;

    @Override
    public Location getLocation() {
        return location;
    }

    protected TimePeriods availabilityPeriods;

    @Override
    public TimePeriods getAvailabilityPeriods() {
        return availabilityPeriods;
    }

    protected ParkingSpaceSize parkingSpaceSize;

    @Override
    public ParkingSpaceSize getParkingSpaceSize() {
        return parkingSpaceSize;
    }

    public ParkingSpaceOfferedGenImpl(String parkingSpaceId, String name, String description, long ownerId, float parkingPricePerHour, Location location, TimePeriods availabilityPeriods, ParkingSpaceSize parkingSpaceSize) {
        this.parkingSpaceId = parkingSpaceId;
        this.name = name;
        this.description = description;
        this.ownerId = ownerId;
        this.parkingPricePerHour = parkingPricePerHour;
        this.location = location;
        this.availabilityPeriods = availabilityPeriods;
        this.parkingSpaceSize = parkingSpaceSize;
    }
}
