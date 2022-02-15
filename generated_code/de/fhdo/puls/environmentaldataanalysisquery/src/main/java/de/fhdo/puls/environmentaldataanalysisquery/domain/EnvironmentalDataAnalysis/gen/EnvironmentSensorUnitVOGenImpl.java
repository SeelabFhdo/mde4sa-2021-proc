package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.Location;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorType;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorUnitStatus;

public abstract class EnvironmentSensorUnitVOGenImpl implements DddValueObject, EnvironmentSensorUnitVOGen {

    public EnvironmentSensorUnitVOGenImpl() {
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

    protected SensorUnitStatus status;

    @Override
    public SensorUnitStatus getStatus() {
        return status;
    }

    protected Location location;

    @Override
    public Location getLocation() {
        return location;
    }

    protected SensorType sensorType;

    @Override
    public SensorType getSensorType() {
        return sensorType;
    }

    public EnvironmentSensorUnitVOGenImpl(String id, String name, long sensorBoxId, String description, SensorUnitStatus status, Location location, SensorType sensorType) {
        this.id = id;
        this.name = name;
        this.sensorBoxId = sensorBoxId;
        this.description = description;
        this.status = status;
        this.location = location;
        this.sensorType = sensorType;
    }
}
