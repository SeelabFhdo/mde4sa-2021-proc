package de.fhdo.puls.chargingstationsharingquery.domain.ChargingStationSharing.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class LocationGenImpl implements DddValueObject, LocationGen {

    public LocationGenImpl() {
    }

    protected String longitude;

    @Override
    public String getLongitude() {
        return longitude;
    }

    @Override
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    protected String latitude;

    @Override
    public String getLatitude() {
        return latitude;
    }

    @Override
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public LocationGenImpl(String longitude, String latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
