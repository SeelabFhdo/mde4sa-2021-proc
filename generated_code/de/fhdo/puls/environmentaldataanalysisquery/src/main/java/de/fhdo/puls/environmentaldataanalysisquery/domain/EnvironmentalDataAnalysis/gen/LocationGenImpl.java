package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class LocationGenImpl implements DddValueObject, LocationGen {

    public LocationGenImpl() {
    }

    protected float longitude;

    @Override
    public float getLongitude() {
        return longitude;
    }

    protected float latitude;

    @Override
    public float getLatitude() {
        return latitude;
    }

    public LocationGenImpl(float longitude, float latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
