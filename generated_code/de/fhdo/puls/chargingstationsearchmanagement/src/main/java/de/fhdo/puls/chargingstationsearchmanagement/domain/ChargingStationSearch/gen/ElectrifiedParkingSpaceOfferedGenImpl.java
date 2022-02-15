package de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.gen;

import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.ChargingType;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.Location;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.ParkingSpaceSize;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.TimePeriods;

public abstract class ElectrifiedParkingSpaceOfferedGenImpl implements ElectrifiedParkingSpaceOfferedGen {

    public ElectrifiedParkingSpaceOfferedGenImpl() {
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

    protected float chargingPricePerKWH;

    @Override
    public float getChargingPricePerKWH() {
        return chargingPricePerKWH;
    }

    protected Location location;

    @Override
    public Location getLocation() {
        return location;
    }

    protected TimePeriods availabilityPeriods;

    @Override
    public TimePeriods getAvailabilityPeriods() {
        return availabilityPeriods;
    }

    protected ParkingSpaceSize parkingSpaceSize;

    @Override
    public ParkingSpaceSize getParkingSpaceSize() {
        return parkingSpaceSize;
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

    public ElectrifiedParkingSpaceOfferedGenImpl(String parkingSpaceId, String name, String description, long ownerId, float parkingPricePerHour, float chargingPricePerKWH, Location location, TimePeriods availabilityPeriods, ParkingSpaceSize parkingSpaceSize, ChargingType chargingType, String pluginType) {
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
