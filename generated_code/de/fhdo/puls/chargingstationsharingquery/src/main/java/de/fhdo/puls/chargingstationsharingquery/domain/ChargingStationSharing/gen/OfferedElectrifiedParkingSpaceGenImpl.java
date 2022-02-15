package de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.gen;

import de.fhdo.lemma.ddd.structure.DddAggregate;
import de.fhdo.lemma.ddd.structure.DddEntity;
import de.fhdo.lemma.ddd.structure.DddIdentifier;
import de.fhdo.lemma.ddd.structure.DddPart;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.ChargingType;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.Location;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.ParkingSpaceSize;
import de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.TimePeriods;
import javax.persistence.Entity;

@Entity()
public abstract class OfferedElectrifiedParkingSpaceGenImpl implements DddEntity, DddAggregate, OfferedElectrifiedParkingSpaceGen {

    public OfferedElectrifiedParkingSpaceGenImpl() {
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

    protected float chargingPricePerKWH;

    @Override
    public float getChargingPricePerKWH() {
        return chargingPricePerKWH;
    }

    @Override
    public void setChargingPricePerKWH(float chargingPricePerKWH) {
        this.chargingPricePerKWH = chargingPricePerKWH;
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

    @DddPart()
    protected ChargingType chargingType;

    @Override
    public ChargingType getChargingType() {
        return chargingType;
    }

    @Override
    public void setChargingType(ChargingType chargingType) {
        this.chargingType = chargingType;
    }

    protected String pluginType;

    @Override
    public String getPluginType() {
        return pluginType;
    }

    @Override
    public void setPluginType(String pluginType) {
        this.pluginType = pluginType;
    }

    public OfferedElectrifiedParkingSpaceGenImpl(String id, String parkingSpaceId, String name, String description, long ownerId, float parkingPricePerHour, float chargingPricePerKWH, Location location, TimePeriods availabilityPeriods, ParkingSpaceSize parkingSpaceSize, ChargingType chargingType, String pluginType) {
        this.id = id;
        this.parkingSpaceId = parkingSpaceId;
        this.name = name;
        this.description = description;
        this.ownerId = ownerId;
        this.parkingPricePerHour = parkingPricePerHour;
        this.chargingPricePerKWH = chargingPricePerKWH;
        this.location = location;
        this.availabilityPeriods = availabilityPeriods;
        this.parkingSpaceSize = parkingSpaceSize;
        this.chargingType = chargingType;
        this.pluginType = pluginType;
    }
}
