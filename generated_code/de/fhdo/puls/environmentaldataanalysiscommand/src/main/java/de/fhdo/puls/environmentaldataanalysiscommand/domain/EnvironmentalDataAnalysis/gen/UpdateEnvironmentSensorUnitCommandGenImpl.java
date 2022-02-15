package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class UpdateEnvironmentSensorUnitCommandGenImpl implements DddValueObject, UpdateEnvironmentSensorUnitCommandGen {

    public UpdateEnvironmentSensorUnitCommandGenImpl() {
    }

    protected String id;

    @Override
    public String getId() {
        return id;
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

    protected String status;

    @Override
    public String getStatus() {
        return status;
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

    public UpdateEnvironmentSensorUnitCommandGenImpl(String id, String name, String description, String status, float longitude, float latitude) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
