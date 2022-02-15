package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorValue;

public interface EnvironmentDataReceivedGen {

    String getSensorUnitId();

    SensorValue getParticulates2();

    SensorValue getParticulates10();

    SensorValue getLight();

    SensorValue getTemperature();

    SensorValue getHumidity();
}
