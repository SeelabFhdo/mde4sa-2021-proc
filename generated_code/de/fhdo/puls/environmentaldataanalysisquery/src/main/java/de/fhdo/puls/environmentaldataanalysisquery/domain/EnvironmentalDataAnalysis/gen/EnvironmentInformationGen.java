package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorValueList;

public interface EnvironmentInformationGen {

    String getId();

    void setId(String id);

    long getSensorBoxId();

    void setSensorBoxId(long sensorBoxId);

    SensorValueList getParticulate2Data();

    void setParticulate2Data(SensorValueList particulate2Data);

    SensorValueList getParticulate10Data();

    void setParticulate10Data(SensorValueList particulate10Data);

    SensorValueList getLightData();

    void setLightData(SensorValueList lightData);

    SensorValueList getTemperaturData();

    void setTemperaturData(SensorValueList temperaturData);

    SensorValueList getHumidityData();

    void setHumidityData(SensorValueList humidityData);
}
