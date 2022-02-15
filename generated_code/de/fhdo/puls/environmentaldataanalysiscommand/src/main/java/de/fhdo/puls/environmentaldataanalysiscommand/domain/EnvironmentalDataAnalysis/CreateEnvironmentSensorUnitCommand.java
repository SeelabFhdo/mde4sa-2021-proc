package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis;

import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen.CreateEnvironmentSensorUnitCommandGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends CreateEnvironmentSensorUnitCommandGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class CreateEnvironmentSensorUnitCommand extends CreateEnvironmentSensorUnitCommandGenImpl {

    public CreateEnvironmentSensorUnitCommand() {
        super();
    }

    public CreateEnvironmentSensorUnitCommand(String name, long sensorBoxId, String description, String status, float longitude, float latitude, String sensorType) {
        super(name, sensorBoxId, description, status, longitude, latitude, sensorType);
    }
}
