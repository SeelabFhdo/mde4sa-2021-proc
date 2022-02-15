package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddDomainEvent;
import de.fhdo.lemma.ddd.structure.DddValueObject;
import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.SensorValue;

public abstract class EnvironmentDataReceivedGenImpl implements DddValueObject, DddDomainEvent, EnvironmentDataReceivedGen {

    public EnvironmentDataReceivedGenImpl() {
    }

    protected String sensorUnitId;

    @Override
    public String getSensorUnitId() {
        return sensorUnitId;
    }

    protected SensorValue particulates2;

    @Override
    public SensorValue getParticulates2() {
        return particulates2;
    }

    protected SensorValue particulates10;

    @Override
    public SensorValue getParticulates10() {
        return particulates10;
    }

    protected SensorValue light;

    @Override
    public SensorValue getLight() {
        return light;
    }

    protected SensorValue temperature;

    @Override
    public SensorValue getTemperature() {
        return temperature;
    }

    protected SensorValue humidity;

    @Override
    public SensorValue getHumidity() {
        return humidity;
    }

    public EnvironmentDataReceivedGenImpl(String sensorUnitId, SensorValue particulates2, SensorValue particulates10, SensorValue light, SensorValue temperature, SensorValue humidity) {
        this.sensorUnitId = sensorUnitId;
        this.particulates2 = particulates2;
        this.particulates10 = particulates10;
        this.light = light;
        this.temperature = temperature;
        this.humidity = humidity;
    }
}
