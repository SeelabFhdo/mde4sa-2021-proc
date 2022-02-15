package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.Location;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorType;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorUnitStatus;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen.EnvironmentSensorUnitVOGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends EnvironmentSensorUnitVOGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class EnvironmentSensorUnitVO extends EnvironmentSensorUnitVOGenImpl {

    public EnvironmentSensorUnitVO() {
        super();
    }

    public EnvironmentSensorUnitVO(String id, String name, long sensorBoxId, String description, SensorUnitStatus status, Location location, SensorType sensorType) {
        super(id, name, sensorBoxId, description, status, location, sensorType);
    }
}
