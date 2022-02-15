package de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.gen;

import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.Location;

public abstract class OfferedParkingSpaceWithdrawedGenImpl implements OfferedParkingSpaceWithdrawedGen {

    public OfferedParkingSpaceWithdrawedGenImpl() {
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

    protected Location location;

    @Override
    public Location getLocation() {
        return location;
    }

    public OfferedParkingSpaceWithdrawedGenImpl(String parkingSpaceId, String name, String description, long ownerId, Location location) {
        this.parkingSpaceId = parkingSpaceId;
        this.name = name;
        this.description = description;
        this.ownerId = ownerId;
        this.location = location;
    }
}
