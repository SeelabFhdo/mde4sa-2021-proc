package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddDomainEvent;
import de.fhdo.lemma.ddd.structure.DddValueObject;
import java.util.Date;

public abstract class EnvironmentSensorUnitUpdatedGenImpl implements DddValueObject, DddDomainEvent, EnvironmentSensorUnitUpdatedGen {

    public EnvironmentSensorUnitUpdatedGenImpl() {
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

    protected Date lastModifiedDate;

    @Override
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    protected String sensorTyp;

    @Override
    public String getSensorTyp() {
        return sensorTyp;
    }

    public EnvironmentSensorUnitUpdatedGenImpl(String sensorUnitId, String name, String description, String status, float longitude, float latitude, Date lastModifiedDate, String sensorTyp) {
        this.sensorUnitId = sensorUnitId;
        this.name = name;
        this.description = description;
        this.status = status;
        this.longitude = longitude;
        this.latitude = latitude;
        this.lastModifiedDate = lastModifiedDate;
        this.sensorTyp = sensorTyp;
    }
}
