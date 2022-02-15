package de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class LocationGenImpl implements DddValueObject, LocationGen {

    public LocationGenImpl() {
    }

    protected double longitued;

    @Override
    public double getLongitued() {
        return longitued;
    }

    @Override
    public void setLongitued(double longitued) {
        this.longitued = longitued;
    }

    protected double latitude;

    @Override
    public double getLatitude() {
        return latitude;
    }

    @Override
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public LocationGenImpl(double longitued, double latitude) {
        this.longitued = longitued;
        this.latitude = latitude;
    }
}
