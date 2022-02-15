package de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.gen;

public abstract class WithdrawParkingSpaceCommandGenImpl implements WithdrawParkingSpaceCommandGen {

    public WithdrawParkingSpaceCommandGenImpl() {
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

    public WithdrawParkingSpaceCommandGenImpl(String parkingSpaceId, long ownerId) {
        this.parkingSpaceId = parkingSpaceId;
        this.ownerId = ownerId;
    }
}
