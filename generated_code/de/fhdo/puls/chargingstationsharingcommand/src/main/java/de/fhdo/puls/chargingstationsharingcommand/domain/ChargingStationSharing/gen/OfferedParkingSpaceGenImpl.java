package de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.gen;

import de.fhdo.lemma.ddd.structure.DddAggregate;
import de.fhdo.lemma.ddd.structure.DddEntity;
import de.fhdo.lemma.ddd.structure.DddIdentifier;
import de.fhdo.lemma.ddd.structure.DddPart;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.Location;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.ParkingSpaceSize;
import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.TimePeriods;
import javax.persistence.Entity;

@Entity()
public abstract class OfferedParkingSpaceGenImpl implements DddEntity, DddAggregate, OfferedParkingSpaceGen {

    public OfferedParkingSpaceGenImpl() {
    }

    @DddIdentifier()
    protected String id;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    protected String parkingSpaceId;

    @Override
    public String getParkingSpaceId() {
        return parkingSpaceId;
    }

    @Override
    public void setParkingSpaceId(String parkingSpaceId) {
        this.parkingSpaceId = parkingSpaceId;
    }

    protected String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    protected String description;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    protected long ownerId;

    @Override
    public long getOwnerId() {
        return ownerId;
    }

    @Override
    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    protected float parkingPricePerHour;

    @Override
    public float getParkingPricePerHour() {
        return parkingPricePerHour;
    }

    @Override
    public void setParkingPricePerHour(float parkingPricePerHour) {
        this.parkingPricePerHour = parkingPricePerHour;
    }

    @DddPart()
    protected Location location;

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    @DddPart()
    protected TimePeriods availabilityPeriods;

    @Override
    public TimePeriods getAvailabilityPeriods() {
        return availabilityPeriods;
    }

    @Override
    public void setAvailabilityPeriods(TimePeriods availabilityPeriods) {
        this.availabilityPeriods = availabilityPeriods;
    }

    @DddPart()
    protected ParkingSpaceSize parkingSpaceSize;

    @Override
    public ParkingSpaceSize getParkingSpaceSize() {
        return parkingSpaceSize;
    }

    @Override
    public void setParkingSpaceSize(ParkingSpaceSize parkingSpaceSize) {
        this.parkingSpaceSize = parkingSpaceSize;
    }

    public OfferedParkingSpaceGenImpl(String id, String parkingSpaceId, String name, String description, long ownerId, float parkingPricePerHour, Location location, TimePeriods availabilityPeriods, ParkingSpaceSize parkingSpaceSize) {
        this.id = id;
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
