package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis;

import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen.EnvironmentSensorUnitCreatedGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends EnvironmentSensorUnitCreatedGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class EnvironmentSensorUnitCreated extends EnvironmentSensorUnitCreatedGenImpl {

    public EnvironmentSensorUnitCreated() {
        super();
    }

    public EnvironmentSensorUnitCreated(String sensorUnitId, String name, long sensorBoxId, String description, String status, float longitude, float latitude, String sensorTyp) {
        super(sensorUnitId, name, sensorBoxId, description, status, longitude, latitude, sensorTyp);
    }
}
