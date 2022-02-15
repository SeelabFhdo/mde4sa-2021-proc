package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.Location;

public abstract class OfferedElectrifiedParkingSpaceWithdrawedGenImpl implements OfferedElectrifiedParkingSpaceWithdrawedGen {

    public OfferedElectrifiedParkingSpaceWithdrawedGenImpl() {
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

    public OfferedElectrifiedParkingSpaceWithdrawedGenImpl(String parkingSpaceId, String name, String description, long ownerId, Location location) {
        this.parkingSpaceId = parkingSpaceId;
        this.name = name;
        this.description = description;
        this.ownerId = ownerId;
        this.location = location;
    }
}
