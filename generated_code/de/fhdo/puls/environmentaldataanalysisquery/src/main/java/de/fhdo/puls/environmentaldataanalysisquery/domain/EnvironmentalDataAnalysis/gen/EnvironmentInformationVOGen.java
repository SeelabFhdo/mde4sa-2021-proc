package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorValueList;

public interface EnvironmentInformationVOGen {

    String getId();

    long getSensorBoxId();

    SensorValueList getParticulate2Data();

    SensorValueList getParticulate10Data();

    SensorValueList getLightData();

    SensorValueList getTemperaturData();

    SensorValueList getHumidityData();
}
