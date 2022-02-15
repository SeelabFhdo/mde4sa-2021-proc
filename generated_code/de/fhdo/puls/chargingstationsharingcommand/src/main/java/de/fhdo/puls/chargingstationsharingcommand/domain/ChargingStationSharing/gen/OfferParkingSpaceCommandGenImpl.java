package de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.gen;

public abstract class OfferParkingSpaceCommandGenImpl implements OfferParkingSpaceCommandGen {

    public OfferParkingSpaceCommandGenImpl() {
    }

    protected String parkingSpaceId;

    @Override
    public String getParkingSpaceId() {
        return parkingSpaceId;
    }

    protected long ownerId;

    @Override
    public long getOwnerId() {
        return ownerId;
    }

    public OfferParkingSpaceCommandGenImpl(String parkingSpaceId, long ownerId) {
        this.parkingSpaceId = parkingSpaceId;
        this.ownerId = ownerId;
    }
}
