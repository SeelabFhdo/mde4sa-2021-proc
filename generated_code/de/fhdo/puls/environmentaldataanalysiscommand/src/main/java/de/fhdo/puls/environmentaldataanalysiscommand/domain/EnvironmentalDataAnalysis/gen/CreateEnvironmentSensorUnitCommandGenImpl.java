package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class CreateEnvironmentSensorUnitCommandGenImpl implements DddValueObject, CreateEnvironmentSensorUnitCommandGen {

    public CreateEnvironmentSensorUnitCommandGenImpl() {
    }

    protected String name;

    @Override
    public String getName() {
        return name;
    }

    protected long sensorBoxId;

    @Override
    public long getSensorBoxId() {
        return sensorBoxId;
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

    protected String sensorType;

    @Override
    public String getSensorType() {
        return sensorType;
    }

    public CreateEnvironmentSensorUnitCommandGenImpl(String name, long sensorBoxId, String description, String status, float longitude, float latitude, String sensorType) {
        this.name = name;
        this.sensorBoxId = sensorBoxId;
        this.description = description;
        this.status = status;
        this.longitude = longitude;
        this.latitude = latitude;
        this.sensorType = sensorType;
    }
}
