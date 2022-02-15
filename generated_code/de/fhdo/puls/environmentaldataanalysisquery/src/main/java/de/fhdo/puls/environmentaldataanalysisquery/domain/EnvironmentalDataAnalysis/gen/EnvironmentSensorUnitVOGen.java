package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.Location;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorType;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorUnitStatus;

public interface EnvironmentSensorUnitVOGen {

    String getId();

    String getName();

    long getSensorBoxId();

    String getDescription();

    SensorUnitStatus getStatus();

    Location getLocation();

    SensorType getSensorType();
}
