package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.SensorValue;

public interface EnvironmentDataReceivedGen {

    String getSensorUnitId();

    SensorValue getParticulates2();

    SensorValue getParticulates10();

    SensorValue getLight();

    SensorValue getTemperature();

    SensorValue getHumidity();
}
