package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddDomainEvent;
import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class EnvironmentSensorUnitCreatedGenImpl implements DddValueObject, DddDomainEvent, EnvironmentSensorUnitCreatedGen {

    public EnvironmentSensorUnitCreatedGenImpl() {
    }

    protected String sensorUnitId;

    @Override
    public String getSensorUnitId() {
        return sensorUnitId;
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

    protected String sensorTyp;

    @Override
    public String getSensorTyp() {
        return sensorTyp;
    }

    public EnvironmentSensorUnitCreatedGenImpl(String sensorUnitId, String name, long sensorBoxId, String description, String status, float longitude, float latitude, String sensorTyp) {
        this.sensorUnitId = sensorUnitId;
        this.name = name;
        this.sensorBoxId = sensorBoxId;
        this.description = description;
        this.status = status;
        this.longitude = longitude;
        this.latitude = latitude;
        this.sensorTyp = sensorTyp;
    }
}
