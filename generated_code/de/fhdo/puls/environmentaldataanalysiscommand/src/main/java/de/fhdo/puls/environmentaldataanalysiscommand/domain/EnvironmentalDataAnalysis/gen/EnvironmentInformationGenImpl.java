package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddAggregate;
import de.fhdo.lemma.ddd.structure.DddEntity;
import de.fhdo.lemma.ddd.structure.DddIdentifier;
import de.fhdo.lemma.ddd.structure.DddPart;
import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.SensorValueList;
import javax.persistence.Entity;

@Entity()
public abstract class EnvironmentInformationGenImpl implements DddEntity, DddAggregate, EnvironmentInformationGen {

    public EnvironmentInformationGenImpl() {
    }

    @DddIdentifier()
    protected String id;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    protected long sensorBoxId;

    @Override
    public long getSensorBoxId() {
        return sensorBoxId;
    }

    @Override
    public void setSensorBoxId(long sensorBoxId) {
        this.sensorBoxId = sensorBoxId;
    }

    @DddPart()
    protected SensorValueList particulate2Data;

    @Override
    public SensorValueList getParticulate2Data() {
        return particulate2Data;
    }

    @Override
    public void setParticulate2Data(SensorValueList particulate2Data) {
        this.particulate2Data = particulate2Data;
    }

    @DddPart()
    protected SensorValueList particulate10Data;

    @Override
    public SensorValueList getParticulate10Data() {
        return particulate10Data;
    }

    @Override
    public void setParticulate10Data(SensorValueList particulate10Data) {
        this.particulate10Data = particulate10Data;
    }

    @DddPart()
    protected SensorValueList lightData;

    @Override
    public SensorValueList getLightData() {
        return lightData;
    }

    @Override
    public void setLightData(SensorValueList lightData) {
        this.lightData = lightData;
    }

    @DddPart()
    protected SensorValueList temperaturData;

    @Override
    public SensorValueList getTemperaturData() {
        return temperaturData;
    }

    @Override
    public void setTemperaturData(SensorValueList temperaturData) {
        this.temperaturData = temperaturData;
    }

    @DddPart()
    protected SensorValueList humidityData;

    @Override
    public SensorValueList getHumidityData() {
        return humidityData;
    }

    @Override
    public void setHumidityData(SensorValueList humidityData) {
        this.humidityData = humidityData;
    }

    public EnvironmentInformationGenImpl(String id, long sensorBoxId, SensorValueList particulate2Data, SensorValueList particulate10Data, SensorValueList lightData, SensorValueList temperaturData, SensorValueList humidityData) {
        this.id = id;
        this.sensorBoxId = sensorBoxId;
        this.particulate2Data = particulate2Data;
        this.particulate10Data = particulate10Data;
        this.lightData = lightData;
        this.temperaturData = temperaturData;
        this.humidityData = humidityData;
    }
}
