package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorValueList;

public abstract class EnvironmentInformationVOGenImpl implements DddValueObject, EnvironmentInformationVOGen {

    public EnvironmentInformationVOGenImpl() {
    }

    protected String id;

    @Override
    public String getId() {
        return id;
    }

    protected long sensorBoxId;

    @Override
    public long getSensorBoxId() {
        return sensorBoxId;
    }

    protected SensorValueList particulate2Data;

    @Override
    public SensorValueList getParticulate2Data() {
        return particulate2Data;
    }

    protected SensorValueList particulate10Data;

    @Override
    public SensorValueList getParticulate10Data() {
        return particulate10Data;
    }

    protected SensorValueList lightData;

    @Override
    public SensorValueList getLightData() {
        return lightData;
    }

    protected SensorValueList temperaturData;

    @Override
    public SensorValueList getTemperaturData() {
        return temperaturData;
    }

    protected SensorValueList humidityData;

    @Override
    public SensorValueList getHumidityData() {
        return humidityData;
    }

    public EnvironmentInformationVOGenImpl(String id, long sensorBoxId, SensorValueList particulate2Data, SensorValueList particulate10Data, SensorValueList lightData, SensorValueList temperaturData, SensorValueList humidityData) {
        this.id = id;
        this.sensorBoxId = sensorBoxId;
        this.particulate2Data = particulate2Data;
        this.particulate10Data = particulate10Data;
        this.lightData = lightData;
        this.temperaturData = temperaturData;
        this.humidityData = humidityData;
    }
}
