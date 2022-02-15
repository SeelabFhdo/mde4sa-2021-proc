package de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.gen;

import de.fhdo.lemma.ddd.structure.DddAggregate;
import de.fhdo.lemma.ddd.structure.DddEntity;
import de.fhdo.lemma.ddd.structure.DddIdentifier;
import de.fhdo.lemma.ddd.structure.DddPart;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ChargingType;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.Location;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ParkingSpaceSize;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.TimePeriods;
import java.util.Date;
import javax.persistence.Entity;

@Entity()
public abstract class ElectrifiedParkingSpaceGenImpl implements DddEntity, DddAggregate, ElectrifiedParkingSpaceGen {

    public ElectrifiedParkingSpaceGenImpl() {
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

    protected Date createdDate;

    @Override
    public Date getCreatedDate() {
        return createdDate;
    }

    @Override
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    protected Date lastModifiedDate;

    @Override
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    @Override
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    protected boolean activated;

    @Override
    public boolean getActivated() {
        return activated;
    }

    @Override
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    protected boolean blocked;

    @Override
    public boolean getBlocked() {
        return blocked;
    }

    @Override
    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    protected boolean offered;

    @Override
    public boolean getOffered() {
        return offered;
    }

    @Override
    public void setOffered(boolean offered) {
        this.offered = offered;
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

    public ElectrifiedParkingSpaceGenImpl(String id, String name, String description, long ownerId, float parkingPricePerHour, Date createdDate, Date lastModifiedDate, boolean activated, boolean blocked, boolean offered, Location location, TimePeriods availabilityPeriods, ParkingSpaceSize parkingSpaceSize, float chargingPricePerKWH, ChargingType chargingType, String pluginType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ownerId = ownerId;
        this.parkingPricePerHour = parkingPricePerHour;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.activated = activated;
        this.blocked = blocked;
        this.offered = offered;
        this.location = location;
        this.availabilityPeriods = availabilityPeriods;
        this.parkingSpaceSize = parkingSpaceSize;
        this.chargingPricePerKWH = chargingPricePerKWH;
        this.chargingType = chargingType;
        this.pluginType = pluginType;
    }
}
