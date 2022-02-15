package de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.gen;

public abstract class OfferElectrifiedParkingSpaceCommandGenImpl implements OfferElectrifiedParkingSpaceCommandGen {

    public OfferElectrifiedParkingSpaceCommandGenImpl() {
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

    public OfferElectrifiedParkingSpaceCommandGenImpl(String parkingSpaceId, long ownerId) {
        this.parkingSpaceId = parkingSpaceId;
        this.ownerId = ownerId;
    }
}
