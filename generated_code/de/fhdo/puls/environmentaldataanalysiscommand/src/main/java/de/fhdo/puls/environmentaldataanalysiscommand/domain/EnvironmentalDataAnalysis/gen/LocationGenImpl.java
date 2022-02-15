package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class LocationGenImpl implements DddValueObject, LocationGen {

    public LocationGenImpl() {
    }

    protected float longitude;

    @Override
    public float getLongitude() {
        return longitude;
    }

    @Override
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    protected float latitude;

    @Override
    public float getLatitude() {
        return latitude;
    }

    @Override
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public LocationGenImpl(float longitude, float latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
