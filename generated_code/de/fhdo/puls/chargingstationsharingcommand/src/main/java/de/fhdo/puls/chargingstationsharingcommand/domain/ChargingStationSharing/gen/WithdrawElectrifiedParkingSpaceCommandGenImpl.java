package de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.gen;

public abstract class WithdrawElectrifiedParkingSpaceCommandGenImpl implements WithdrawElectrifiedParkingSpaceCommandGen {

    public WithdrawElectrifiedParkingSpaceCommandGenImpl() {
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

    public WithdrawElectrifiedParkingSpaceCommandGenImpl(String parkingSpaceId, long ownerId) {
        this.parkingSpaceId = parkingSpaceId;
        this.ownerId = ownerId;
    }
}
