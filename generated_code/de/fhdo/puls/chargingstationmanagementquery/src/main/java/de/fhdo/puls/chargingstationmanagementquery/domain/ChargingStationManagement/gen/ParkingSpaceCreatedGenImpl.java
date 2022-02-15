package de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.gen;

import de.fhdo.lemma.ddd.structure.DddDomainEvent;
import de.fhdo.lemma.ddd.structure.DddValueObject;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.Location;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ParkingSpaceSize;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.TimePeriods;

public abstract class ParkingSpaceCreatedGenImpl implements DddValueObject, DddDomainEvent, ParkingSpaceCreatedGen {

    public ParkingSpaceCreatedGenImpl() {
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

    protected ParkingSpaceSize parkingSpaceSize;

    @Override
    public ParkingSpaceSize getParkingSpaceSize() {
        return parkingSpaceSize;
    }

    protected TimePeriods availablePeriods;

    @Override
    public TimePeriods getAvailablePeriods() {
        return availablePeriods;
    }

    public ParkingSpaceCreatedGenImpl(String parkingSpaceId, String name, String description, long ownerId, float parkingPricePerHour, boolean activated, boolean blocked, boolean offered, Location location, ParkingSpaceSize parkingSpaceSize, TimePeriods availablePeriods) {
        this.parkingSpaceId = parkingSpaceId;
        this.name = name;
        this.description = description;
        this.ownerId = ownerId;
        this.parkingPricePerHour = parkingPricePerHour;
        this.activated = activated;
        this.blocked = blocked;
        this.offered = offered;
        this.location = location;
        this.parkingSpaceSize = parkingSpaceSize;
        this.availablePeriods = availablePeriods;
    }
}
