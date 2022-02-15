package de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.Location;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.ParkingSpaceSize;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.TimePeriods;

public abstract class CreateParkingSpaceCommandGenImpl implements DddValueObject, CreateParkingSpaceCommandGen {

    public CreateParkingSpaceCommandGenImpl() {
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

    protected boolean activated;

    @Override
    public boolean getActivated() {
        return activated;
    }

    protected boolean blocked;

    @Override
    public boolean getBlocked() {
        return blocked;
    }

    protected boolean offered;

    @Override
    public boolean getOffered() {
        return offered;
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

    public CreateParkingSpaceCommandGenImpl(String name, String description, long ownerId, float parkingPricePerHour, boolean activated, boolean blocked, boolean offered, Location location, TimePeriods availabilityPeriods, ParkingSpaceSize parkingSpaceSize) {
        this.name = name;
        this.description = description;
        this.ownerId = ownerId;
        this.parkingPricePerHour = parkingPricePerHour;
        this.activated = activated;
        this.blocked = blocked;
        this.offered = offered;
        this.location = location;
        this.availabilityPeriods = availabilityPeriods;
        this.parkingSpaceSize = parkingSpaceSize;
    }
}
