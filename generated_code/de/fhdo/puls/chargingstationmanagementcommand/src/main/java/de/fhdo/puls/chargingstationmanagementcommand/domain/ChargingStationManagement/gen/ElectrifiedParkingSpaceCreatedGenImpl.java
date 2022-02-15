package de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.gen;

import de.fhdo.lemma.ddd.structure.DddDomainEvent;
import de.fhdo.lemma.ddd.structure.DddValueObject;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.ChargingType;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.Location;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.ParkingSpaceSize;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.TimePeriods;

public abstract class ElectrifiedParkingSpaceCreatedGenImpl implements DddValueObject, DddDomainEvent, ElectrifiedParkingSpaceCreatedGen {

    public ElectrifiedParkingSpaceCreatedGenImpl() {
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

    protected float chargingPricePerKWH;

    @Override
    public float getChargingPricePerKWH() {
        return chargingPricePerKWH;
    }

    protected ChargingType chargingType;

    @Override
    public ChargingType getChargingType() {
        return chargingType;
    }

    protected String pluginType;

    @Override
    public String getPluginType() {
        return pluginType;
    }

    protected TimePeriods availablePeriods;

    @Override
    public TimePeriods getAvailablePeriods() {
        return availablePeriods;
    }

    public ElectrifiedParkingSpaceCreatedGenImpl(String parkingSpaceId, String name, String description, long ownerId, float parkingPricePerHour, boolean activated, boolean blocked, boolean offered, Location location, ParkingSpaceSize parkingSpaceSize, float chargingPricePerKWH, ChargingType chargingType, String pluginType, TimePeriods availablePeriods) {
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
        this.chargingPricePerKWH = chargingPricePerKWH;
        this.chargingType = chargingType;
        this.pluginType = pluginType;
        this.availablePeriods = availablePeriods;
    }
}
